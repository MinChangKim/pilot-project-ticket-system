package com.ticketsystem.Service;

import com.ticketsystem.domain.Show;
import com.ticketsystem.errors.ShowNotFoundException;
import com.ticketsystem.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mckim on 2016. 4. 11..
 */
@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    public Show save(Show show) {
        return showRepository.save(show);
    }

    public Show find(Long id) {
        Show show = showRepository.findOne(id);
        if (show == null) {
            throw new ShowNotFoundException(id);
        }

        return show;
    }

    public Page<Show> find(Pageable pageable) {
        return showRepository.findAll(pageable);
    }

}
