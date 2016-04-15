package com.ticketsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mckim on 2016. 3. 30..
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "SHOW")
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SHOW_SEQ")
    private Long showSeq;    //공연정보순번

    @Column(name = "SHOW_CD")
    private String showCd;    //공연코드

    @Column(name = "TITLE")
    private String title;    //공연제목

    @Column(name = "START_DATE")
    private String startDate;   //공연기간시작일

    @Column(name = "END_DATE")
    private String endDate;     //공연기간종료일

    @Column(name = "RUNNING_TIME")
    private String runningTime;   //러닝타임

    @Column(name = "CONTENTS")
    private String contents;    //공연설명

    @Column(name = "UPDATE_ID")
    private String updateId;    //수정자아이디

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DATE")
    private Date updateDate;    //수정일자

    @Column(name = "REG_ID")
    private String regId;     //등록자 아이디

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "REG_DATE")
    private Date regDate;    //등록일자

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowDet> showDets = new ArrayList<ShowDet>();


}
