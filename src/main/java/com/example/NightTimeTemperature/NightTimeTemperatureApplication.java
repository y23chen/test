package com.example.NightTimeTemperature;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.NightTimeTemperature.wiremock.WiremockServerInit;


@SpringBootApplication
public class NightTimeTemperatureApplication {

	public static void main(String[] args) {
	    if (args[0].endsWith("dev")) {
	    	mock_night_time_temperature();
	    	
	    
	    }
		SpringApplication.run(NightTimeTemperatureApplication.class, args);
	
	}
	
	private  static void mock_night_time_temperature(){
	
		WiremockServerInit wiremockServerInit = new WiremockServerInit();
		wiremockServerInit.mock_night_time_temperature();
	
		
	}

}
