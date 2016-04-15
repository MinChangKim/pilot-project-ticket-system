package com.ticketsystem.service;

import com.ticketsystem.domain.ShowDet;

/**
 * Created by mckim on 2016. 4. 12..
 */
public interface ShowDetService {

    ShowDet save(ShowDet showDet);

    ShowDet find(Long id);
}
