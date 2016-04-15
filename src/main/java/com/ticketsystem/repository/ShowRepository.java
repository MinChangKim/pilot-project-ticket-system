package com.ticketsystem.repository;

import com.ticketsystem.domain.Show;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mckim on 2016. 4. 11..
 */
public interface ShowRepository extends JpaRepository<Show, Long> {
}
