package com.example.NightTimeTemperature.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.github.tomakehurst.wiremock.WireMockServer;


@Configuration
public class AppConfig {

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	@Bean
	WireMockServer wireMockServerTemplate() {
		WireMockServer wireMockServer = new WireMockServer();
		return wireMockServer;
	}
}