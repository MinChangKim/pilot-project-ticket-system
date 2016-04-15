package com.ticketsystem.domain;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by mckim on 2016. 3. 30..
 */
public class ShowTest {

    @Test
    public void test_엔티티생성() throws Exception {

        //given

        //when
        Show show = new Show();
        ShowDet showDet = new ShowDet();
        Ticketing ticketing = new Ticketing();
        User user = new User();

        //then
        assertNotNull(show);
        assertNotNull(showDet);
        assertNotNull(ticketing);
        assertNotNull(user);
    }




}