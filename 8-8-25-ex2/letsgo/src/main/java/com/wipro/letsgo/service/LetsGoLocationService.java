package com.wipro.letsgo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.LetsGoLocation;

@Service
public interface LetsGoLocationService {
	LetsGoLocation save(LetsGoLocation letsGoLocation);
	List<LetsGoLocation> findall();
}
