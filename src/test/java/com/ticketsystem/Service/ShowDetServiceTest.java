package com.ticketsystem.Service;

import com.ticketsystem.TicketSystemApplication;
import com.ticketsystem.domain.Show;
import com.ticketsystem.domain.ShowDet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;

/**
 * Created by mckim on 2016. 4. 12..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TicketSystemApplication.class)
@Transactional
public class ShowDetServiceTest {

    @Autowired private ShowService showService;
    @Autowired private ShowDetService showDetService;

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void test_ShowDet_등록() {

        //given
        Show show = new Show();
        show.setShowCd("S20160412_2");
        show.setTitle("우형 Show");
        show.setContents("우형 Show Contents");

        Show createShow = showService.save(show);

        ShowDet showDet = new ShowDet();
        showDet.setShowDetCd("S20160412_2_1");
        showDet.setShowDate("2016년 4월 5일");
        showDet.setInning(1);
        showDet.setShowTime("150분");
        showDet.setSellPrice(30000);
        showDet.setTicketCnt(100);
        showDet.setShowCd(createShow.getShowCd());
        showDet.setShow(createShow);

        //String textShowDate = "2007-07-22";
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Date showDate = simpleDateFormat.parse(textShowDate);


        //when
        ShowDet createShowDet = showDetService.save(showDet);

        //then
        assertEquals(createShow.getShowCd(), createShowDet.getShowCd());

    }
}
