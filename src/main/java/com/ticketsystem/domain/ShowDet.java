package com.ticketsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by mckim on 2016. 4. 2..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SHOW_DET")
public class ShowDet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SHOW_DET_SEQ")
    private Long showDetSeq;    //공연상세정보순번

    @Column(name = "SHOW_CD")
    private String showCd;      //공연코드

    @Column(name = "SHOW_DET_CD")
    private String showDetCd;   //공연상세코드

    @Column(name = "SHOW_DATE")
    private String showDate;    //공연일

    @Column(name = "INNING")
    private int inning;         //회차

    @Column(name = "SHOW_TIME")
    private String showTime;     //공연(시작)시간

    @Column(name = "SELLING_PRICE")
    private int sellPrice;       //판매가

    @Column(name = "TICKET_CNT")
    private int ticketCnt;      //티켓수

    @Column(name = "UPDATE_ID")
    private String updateId;    //수정자아이디

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;    //수정일자

    @Column(name = "REG_ID")
    private String regId;       //등록자아이디

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REG_DATE")
    private Date regDate;       //등록일자

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "showSeq")
    private Show show;



}
