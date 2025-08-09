package com.wipro.letsgo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.letsgo.entity.LetsGoLocation;
import com.wipro.letsgo.service.LetsGoLocationService;

@RestController
@RequestMapping("/move")
public class LetsGoController {

    @Autowired
    LetsGoLocationService letsGoLocationService;

    @PostMapping
    public LetsGoLocation moveVehicle(@RequestBody LetsGoLocation letsGoLocation) {
        return letsGoLocationService.save(letsGoLocation);
    }
    
    @GetMapping
    public List<LetsGoLocation> findall() {
        return letsGoLocationService.findall();
    }
}