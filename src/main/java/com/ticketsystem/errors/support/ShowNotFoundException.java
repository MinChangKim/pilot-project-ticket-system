package com.ticketsystem.errors.support;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

/**
 * Created by mckim on 2016. 4. 12..
 */
@AllArgsConstructor
public class ShowNotFoundException extends RuntimeException {
    @Getter
    private Long id;
}
