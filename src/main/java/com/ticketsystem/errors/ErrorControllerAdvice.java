package com.ticketsystem.errors;

import com.ticketsystem.errors.support.ShowNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by mckim on 2016. 4. 15..
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class ErrorControllerAdvice {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {ShowNotFoundException.class})
    public void showNotFoundException(ShowNotFoundException exception) {

        log.error("showNotFoundException:{}", exception);

    }
}
