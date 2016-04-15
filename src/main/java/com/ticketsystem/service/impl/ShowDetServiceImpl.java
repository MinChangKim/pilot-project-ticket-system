package com.ticketsystem.service.impl;

import com.ticketsystem.domain.Show;
import com.ticketsystem.domain.ShowDet;
import com.ticketsystem.repository.ShowDetRepository;
import com.ticketsystem.repository.ShowRepository;
import com.ticketsystem.service.ShowDetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mckim on 2016. 4. 15..
 */
@Service
public class ShowDetServiceImpl implements ShowDetService {

    @Autowired
    private ShowDetRepository showDetRepository;

    @Autowired
    private ShowRepository showRepository;

    public ShowDet save(ShowDet showDet) {

        //ToDo : showSeq 입력방법 확인
        //Show show = showRepository.findOne(showId);
        //showDet.setShowCd(show.getShowCd());
        //showDet.setShow(show);

        return showDetRepository.save(showDet);
    }

    public ShowDet find(Long id) {
        return showDetRepository.findOne(id);
    }
}
