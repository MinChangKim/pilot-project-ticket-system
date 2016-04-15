package com.ticketsystem.web;

import com.ticketsystem.Service.ShowService;
import com.ticketsystem.domain.Show;
import com.ticketsystem.dto.ShowDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    public ResponseEntity<?> createShow(Show show) {

        Show createShow = showService.save(show);

        log.info("등록 로그========> {}", ResponseEntity.status(HttpStatus.CREATED).build());

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    /**
     * show 리스트 조회
    */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getShows(@RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {

        //page, pagesize, sort
        PageRequest pageRequest = new PageRequest(page-1, pageSize, new Sort(Sort.Direction.DESC, "showSeq"));

        Page<Show> shows = showService.find(pageRequest);
        List<Show> showList = shows.getContent();

        /**
        List<ShowDto.ListResponse> showDtoListResponse = new ArrayList<ShowDto.ListResponse>();

        if (showList != null && !showList.isEmpty()) {
            int showListSize = showList.size();

            for(int i = 0; i < showListSize; i++) {
                ShowDto.ListResponse tmpShowDtoListResponse = new ShowDto.ListResponse();

                tmpShowDtoListResponse.setShowSeq(showList.get(i).getShowSeq());
                tmpShowDtoListResponse.setShowCd(showList.get(i).getShowCd());
                tmpShowDtoListResponse.setTitle(showList.get(i).getTitle());
                tmpShowDtoListResponse.setStartDate(showList.get(i).getStartDate());
                tmpShowDtoListResponse.setEndDate(showList.get(i).getEndDate());
                tmpShowDtoListResponse.setRunningTime(showList.get(i).getRunningTime());

                showDtoListResponse.add(tmpShowDtoListResponse);
            }
        }

        log.info("조회 로그========> {}", ResponseEntity.ok(showDtoListResponse));

        if (showDtoListResponse != null)
            return ResponseEntity.ok(showDtoListResponse);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
         */

        if (showList != null)
            return ResponseEntity.ok(showList);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
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
