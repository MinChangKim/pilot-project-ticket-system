package com.ticketsystem.dto;

import lombok.Data;

import java.util.Date;

/**
 * Created by mckim on 2016. 4. 14..
 */
@Data
public class ShowDto {

    private String ErrorCode;
    private String ErrorMsg;

    public ShowDto() {

    }

    @Data
    public static class ListResponse extends ShowDto {

        private Long showSeq;    //순번
        private String showCd;    //공연코드
        private String title;    //공연제목
        private Date startDate;   //공연기간시작일
        private Date endDate;     //공연기간종료일
        private String runningTime;   //러닝타임
        private String contents;    //공연설명
        private String updateId;    //수정자아이디
        private Date updateDate;    //수정일자
        private String regId;     //등록자 아이디
        private Date regDate;    //등록일자

    }

    @Data
    public static class Response extends ListResponse {

    }

}
