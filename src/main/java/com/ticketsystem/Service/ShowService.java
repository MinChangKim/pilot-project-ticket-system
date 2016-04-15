package com.ticketsystem.service;

import com.ticketsystem.domain.Show;
import com.ticketsystem.dto.ShowDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by mckim on 2016. 4. 11..
 */
public interface ShowService {

    Show save(ShowDto.Request showDto);

    Show find(Long id);

    Page<Show> find(Pageable pageable);

}
