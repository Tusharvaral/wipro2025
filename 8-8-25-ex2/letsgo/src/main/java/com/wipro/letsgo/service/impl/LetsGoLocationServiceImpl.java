package com.wipro.letsgo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.letsgo.entity.LetsGoLocation;
import com.wipro.letsgo.repo.LetsGoLocationRepo;
import com.wipro.letsgo.service.LetsGoLocationService;

@Service
public class LetsGoLocationServiceImpl implements LetsGoLocationService {
	@Autowired
    LetsGoLocationRepo letsGoLocationRepo;
	
	public LetsGoLocation save(LetsGoLocation letsGoLocation) {
        return letsGoLocationRepo.save(letsGoLocation);
    }

    public List<LetsGoLocation> findall() {
        return letsGoLocationRepo.findAll();
    
}
}