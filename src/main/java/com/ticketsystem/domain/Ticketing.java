package com.ticketsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by mckim on 2016. 3. 29..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TICKETING")
public class Ticketing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TICKETING_SEQ")
    private Long ticketingSEq;

    @Column(name = "TICKETING_CD")
    private String ticketingCd;

    @Column(name = "SHOW_Cd")
    private String showCd;

    @Column(name = "SHOWDET_CD")
    private String showDetCd;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "TICKETING_CNT")
    private int ticketingCnt;

    @Column(name = "TICKETING_DATE")
    private Date ticketingDate;

    @Column(name = "PURCHASE_PRICE")
    private int purchasePrice;

    @Column(name = "DISCOUNT_RATE")
    private int discountRate;

    @Column(name = "DISCOUNT_PRICE")
    private int discountPrice;


}
