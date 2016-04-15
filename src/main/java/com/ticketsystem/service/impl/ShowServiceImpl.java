package com.ticketsystem.service.impl;

import com.ticketsystem.domain.Show;
import com.ticketsystem.dto.ShowDto;
import com.ticketsystem.errors.support.ShowNotFoundException;
import com.ticketsystem.repository.ShowRepository;
import com.ticketsystem.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by mckim on 2016. 4. 15..
 */
@Service
@Transactional
public class ShowServiceImpl implements ShowService {

    @Autowired
    private ShowRepository showRepository;

    public Show save(ShowDto.Request showDto) {

        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);        // 년도를 리턴
        int month = now.get(Calendar.MONTH) + 1;  // 월을 리턴
        int day = now.get(Calendar.DAY_OF_MONTH); // 일을 리턴
        //int week = now.get(Calendar.DAY_OF_WEEK); // 요일을 리턴
        //int amPm = now.get(Calendar.AM_PM);       // 오전/오후를 리턴
        int hour = now.get(Calendar.HOUR);        // 시를 리턴
        int minute = now.get(Calendar.MINUTE);    // 분을 리턴
        int second = now.get(Calendar.SECOND);    // 초를 리턴
        String showCd = String.valueOf(year) + "_" + String.valueOf(month) + String.valueOf(day) + String.valueOf(hour)
                                             + "_" + String.valueOf(minute) + String.valueOf(second);

        Show show = new Show();
        show.setShowCd(showCd);
        show.setTitle(showDto.getTitle());
        show.setStartDate(showDto.getStartDate());
        show.setEndDate(showDto.getEndDate());
        show.setRunningTime(showDto.getRunningTime());
        show.setContents(showDto.getContents());
        show.setRegDate(new Date());
        show.setUpdateDate(new Date());
        //ToDo : showCd 생성
        //ToDo : Reg_Id, Update_Id 생성

        return showRepository.save(show);
    }

    public Show find(Long id) {
        Show show = showRepository.findOne(id);
        return show;
    }

    public Page<Show> find(Pageable pageable) {
        return showRepository.findAll(pageable);
    }
}
