package com.example.NightTimeTemperature.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

import com.example.NightTimeTemperature.service.NightTimeTemperatureService;
import com.example.NightTimeTemperature.service.NightTimeTemperatureServiceImpl;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;


public class WiremockServerInit  {
	  

	  private NightTimeTemperatureService nightTimeTemperatureService;

	  private WireMockServer wireMockServer;
	 
	 
	  public String mock_night_time_temperature(){
	     wireMockServer = new WireMockServer(WireMockConfiguration.options().
	                port(8080));
		 wireMockServer.start();
		 
		 //to-do: add parameters dynamically
         String lat = lat="43.66258321585993";
         String lng="-79.39152689466948";
         nightTimeTemperatureService = new NightTimeTemperatureServiceImpl();
         
         String returnMessage = "Welcome to WireMock!" + nightTimeTemperatureService.processService(lat, lng);
         wireMockServer.stubFor(get(urlEqualTo("/mock-night-time-temperature"))
                        .willReturn(aResponse().withHeader("Content-Type", "text/plain")
                        .withStatus(200).withBody( returnMessage)));
         System.out.println("Server started");
         try {
             Thread.sleep(60000);
            
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         wireMockServer.stop();
         
         return returnMessage;
	  }

	 
}
