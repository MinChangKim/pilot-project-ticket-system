package com.ticketsystem.service;

import com.ticketsystem.TicketSystemApplication;
import com.ticketsystem.domain.Show;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by mckim on 2016. 4. 11..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TicketSystemApplication.class)
@Transactional
public class ShowServiceTest {

    @Autowired
    private ShowService showService;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }
/**
    @Test
    public void test_Show_등록() {
        //given
        Show show = new Show();

        show.setShowCd("S20160412_1");         //공연코드
        show.setTitle("우형 Show");             //공연제목
        //show.setStartDate();        //공연기간시작일
        //show.setEndDate();          //공연기간종료일
        show.setRunningTime("150분");
        show.setContents("우형 Show Contents"); //공연내용
        show.setUpdateId("mckim");
        show.setUpdateDate(new Date());
        show.setRegId("mckim");
        show.setRegDate(new Date());

        //when
        Show createShow = showService.save(show);

        //then
        assertEquals(show.getShowCd(), createShow.getShowCd());
        assertEquals(show.getTitle(), createShow.getTitle());
        assertEquals(show.getContents(), createShow.getContents());
        assertEquals(show.getRunningTime(), createShow.getRunningTime());
    }

    @Test
    public void test_Show_FindAll_Page() {
        //given
        PageRequest pageRequest = new PageRequest(0, 10, new Sort(Sort.Direction.DESC, "showCd"));

        //when
        Page<Show> showList = showService.find(pageRequest);

        //then
        List<Show> shows = showList.getContent();         //조회된 데이터
        int totalPages = showList.getTotalPages();        //전체페이지수
        long totalElements = showList.getTotalElements(); //전체데이터수
        boolean hasContent = showList.hasContent();       //조회된데이터존재여부

        System.out.println("totalPages = " + totalPages);
        System.out.println("totalElements = " + totalElements);
        System.out.println("hasContent = " + hasContent);
    }
    */
}
