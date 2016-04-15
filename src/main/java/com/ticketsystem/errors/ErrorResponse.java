package com.ticketsystem.errors;

import lombok.Data;

/**
 * Created by mckim on 2016. 4. 15..
 */
@Data
public class ErrorResponse {
    private int status;
    private int code;
    private String message;
    private String developerMassage;
    private String moreInfo;
}
