package com.example.NightTimeTemperature.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.NightTimeTemperature.service.NightTimeTemperatureService;


@RestController
public class NightTimeTemperatureController {
	
	 @Autowired
	    private NightTimeTemperatureService nightTimeTemperatureService;

	    @RequestMapping("/hello")
	    public String greeting() {

	        return nightTimeTemperatureService.processService("hello world!");
	    }
	    
	    @RequestMapping("/night-time-temperature")
	    public String getNTTemperature(String lat, String lng) {

	        return nightTimeTemperatureService.processService(lat, lng);
	    }
	    
	    
	 
	 
	
}
