package com.example.NightTimeTemperature;
import org.junit.Before;
import org.junit.Test;

import com.example.NightTimeTemperature.service.NightTimeTemperatureService;
import com.example.NightTimeTemperature.service.NightTimeTemperatureServiceImpl;
import com.example.NightTimeTemperature.wiremock.WiremockServerInit;

import static org.assertj.core.api.Assertions.assertThat;
public class NightTimeTemperatureService_IntegrationTest {
	  private NightTimeTemperatureService nightTimeTemperatureService;
	  private WiremockServerInit wiremockServerInit;

	    @Before
	    public void setUp() {
	    	nightTimeTemperatureService = new NightTimeTemperatureServiceImpl();
	    	wiremockServerInit = new WiremockServerInit();
	    }

	    @Test
	    public void testHelloService() {
	        assertThat(nightTimeTemperatureService.helloTest()).isEqualTo("Hello World!");
	    }
	    
	    
	    
	    @Test
	    public void testMockNightTimeTemperatureService() {
	 
	        assertThat(wiremockServerInit.mock_night_time_temperature()).contains("Welcome to WireMock!");
	    }
	    
	    
}
