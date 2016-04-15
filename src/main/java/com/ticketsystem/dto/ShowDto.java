package com.ticketsystem.dto;

import com.ticketsystem.domain.Show;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by mckim on 2016. 4. 14..
 */
@Getter @Setter
public class ShowDto {

    private Long showSeq;         //순번
    private String showCd;        //공연코드
    private String title;         //공연제목
    private String startDate;     //공연기간시작일
    private String endDate;       //공연기간종료일
    private String runningTime;   //러닝타임
    private String contents;      //공연설명

    public ShowDto() {

    }

    @Getter @Setter
    @NoArgsConstructor
    public static class Request extends ShowDto {

        public Request(String title, String startDate, String endDate, String runningTime, String contents) {
            setTitle(title);
            setStartDate(startDate);
            setEndDate(endDate);
            setRunningTime(runningTime);
            setContents(contents);
        }
    }

    @Getter @Setter
    public static class Response extends ShowDto {
        private String updateId;    //수정자아이디
        private Date updateDate;    //수정일자
        private String regId;       //등록자 아이디
        private Date regDate;       //등록일자
    }

    @Getter @Setter
    @NoArgsConstructor @AllArgsConstructor
    public static class ResponseList {
        private Long totalCount;
        private List<Show> showList;
    }

}
