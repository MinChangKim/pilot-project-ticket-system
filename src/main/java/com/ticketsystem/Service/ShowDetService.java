package com.ticketsystem.Service;

import com.ticketsystem.domain.ShowDet;
import com.ticketsystem.repository.ShowDetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mckim on 2016. 4. 12..
 */
@Service
public class ShowDetService {

    @Autowired
    private ShowDetRepository showDetRepository;

    public ShowDet save(ShowDet showDet) {
        return showDetRepository.save(showDet);
    }

    public ShowDet read(Long id) {
        return showDetRepository.findOne(id);
    }
}
