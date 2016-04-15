package com.ticketsystem.web;

import com.ticketsystem.domain.ShowDet;
import com.ticketsystem.service.ShowDetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mckim on 2016. 4. 15..
 */
@RestController
@RequestMapping(value = "/showDet")
@Slf4j
public class ShowDetController {

    @Autowired
    ShowDetService showDetService;

    /**
     * showDet 저장
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createShowDet(ShowDet showDet) {
        ShowDet createShowDet = showDetService.save(showDet);

        log.info("등록 로그========> {}", ResponseEntity.status(HttpStatus.CREATED).build());

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    /**
     * show 상세조회
     */
    @RequestMapping(value = "{showDetId}", method = RequestMethod.GET)
    public ShowDet getShow(@PathVariable("showDetId") Long showDetId){
        ShowDet showDet = showDetService.find(showDetId);

        return showDet;
    }

}
