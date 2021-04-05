package com.example.NightTimeTemperature;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.NightTimeTemperature.service.NightTimeTemperatureService;
import com.example.NightTimeTemperature.service.NightTimeTemperatureServiceImpl;
import com.example.NightTimeTemperature.wiremock.WiremockServerInit;



@SpringBootTest
public   class NightTimeTemperatureApplicationTests {
	private NightTimeTemperatureService nightTimeTemperatureService;
	private WiremockServerInit wiremockServerInit;
	 
		@Test
	    public void testAdd() {
	        assertEquals(99, Integer.sum(19, 80));
	    }
		


	    @Test
	    public void testHelloService() {
	    	nightTimeTemperatureService = new NightTimeTemperatureServiceImpl();
	        assertThat(nightTimeTemperatureService.helloTest()).isEqualTo("Hello World!");
	    }
	    

	    @Test
	    public void testMockNightTimeTemperatureService() {
	    	wiremockServerInit = new WiremockServerInit();
	        assertThat(wiremockServerInit.mock_night_time_temperature()).contains("Welcome to WireMock!");
	    }
	    

	
}
