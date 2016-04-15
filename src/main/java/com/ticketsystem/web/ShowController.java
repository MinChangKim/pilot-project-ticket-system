package com.ticketsystem.web;

import com.ticketsystem.domain.Show;
import com.ticketsystem.dto.ShowDto;
import com.ticketsystem.service.ShowService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Created by mckim on 2016. 4. 14..
 */
@RestController
@RequestMapping(value = "/show")
@Slf4j
public class ShowController {

    @Autowired
    ShowService showService;

    /**
     * show 저장
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    //public ResponseEntity<?> createShow(Show show, BindingResult result) {
    public ResponseEntity<?> createShow(ShowDto.Request showDto, BindingResult result) {

        if (result.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result.getAllErrors());
        }

        Show createShow = showService.save(showDto);

        log.info("등록 로그========> {}", ResponseEntity.status(HttpStatus.CREATED).build());

        ShowDto.Response responseShow = new ShowDto.Response();
        responseShow.setShowSeq(createShow.getShowSeq());
        responseShow.setShowCd(createShow.getShowCd());
        responseShow.setTitle(createShow.getTitle());
        responseShow.setStartDate(createShow.getStartDate());
        responseShow.setEndDate(createShow.getEndDate());
        responseShow.setRunningTime(createShow.getRunningTime());
        responseShow.setContents(createShow.getContents());

        log.info("등록 로그========> {}", ResponseEntity.status(HttpStatus.CREATED).body(responseShow));
        return ResponseEntity.status(HttpStatus.CREATED).body(responseShow);
    }

    /**
     * show 리스트 조회
     * //@RequestParam("page") int page, @RequestParam("pageSize") int pageSize
    */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getShows(HttpServletRequest request) {

        int page;
        int pageSize;

        if (request.getParameter("page") == null) {
            page = 0;
        } else {
            page = Integer.parseInt(request.getParameter("page"))-1;
        }

        if (request.getParameter("pageSize") == null) {
            pageSize = 10;
        } else {
            pageSize = Integer.parseInt(request.getParameter("pageSize"));
        }

        //page, pagesize, sort
        PageRequest pageRequest = new PageRequest(page, pageSize, new Sort(Sort.Direction.DESC, "showSeq"));

        Page<Show> shows = showService.find(pageRequest);
        Long totalCount = shows.getTotalElements();
        List<Show> showList = shows.getContent();
        ShowDto.ResponseList responseList = new ShowDto.ResponseList(totalCount, showList);

        if (showList == null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

        return ResponseEntity.ok(responseList);
    }

    /**
     * show 상세조회
     */
    @RequestMapping(value = "{showId}", method = RequestMethod.GET)
    public Show getShow(@PathVariable("showId") Long showId){
        Show show = showService.find(showId);
        return show;
    }

}
