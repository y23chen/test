package com.example.NightTimeTemperature.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NightTimeTemperatureServiceImpl implements NightTimeTemperatureService {


    @Autowired
    public NightTimeTemperatureServiceImpl() {
       
    }

    @Override
    public String processService(String input) {
        return String.format("");
    }
    
    @Override
    public String processService(String input1, String input2) {
       String uri = "https://api.sunrise-sunset.org/json?lat=" + input1 + "&lng=" + input2;
    		 
    	RestTemplate restTemplate = new RestTemplate();
    	 ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);

    	return String.format("" + response);
    }
    
    public String helloTest() {
    	
    	 return "Hello World!";
    }
   
}
