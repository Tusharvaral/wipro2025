package com.wipro.letsgo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.letsgo.entity.LetsGoLocation;

public interface LetsGoLocationRepo extends JpaRepository<LetsGoLocation, Long> {

}
