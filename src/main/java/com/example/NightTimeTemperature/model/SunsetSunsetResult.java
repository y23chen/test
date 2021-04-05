package com.example.NightTimeTemperature.model;


public class SunsetSunsetResult {

	/*
	 "sunrise":"2015-05-21T05:05:35+00:00",
     "sunset":"2015-05-21T19:22:59+00:00",
     "solar_noon":"2015-05-21T12:14:17+00:00",
     "day_length":51444,
     "civil_twilight_begin":"2015-05-21T04:36:17+00:00",
     "civil_twilight_end":"2015-05-21T19:52:17+00:00",
     "nautical_twilight_begin":"2015-05-21T04:00:13+00:00",
     "nautical_twilight_end":"2015-05-21T20:28:21+00:00",
     "astronomical_twilight_begin":"2015-05-21T03:20:49+00:00",
     "astronomical_twilight_end":"2015-05-21T21:07:45+00:00"
     
     */
	
	
	  public SunsetSunsetResult() {

	    }

	    public SunsetSunsetResult(String sunrise, String sunset, String solar_noon, String day_length,String civil_twilight_begin,
	    		 String civil_twilight_end,String nautical_twilight_begin,String nautical_twilight_end,String astronomical_twilight_begin,String astronomical_twilight_end ) {
	        super();
	        this.sunrise = sunrise;
	        this.sunset = sunset;
	        this.solar_noon = solar_noon;
	        this.day_length = day_length;
	        this.civil_twilight_begin = civil_twilight_begin;
	        this.civil_twilight_end = civil_twilight_end;
	        this.nautical_twilight_begin = nautical_twilight_begin;
	        this.nautical_twilight_end = nautical_twilight_end;
	        this.astronomical_twilight_begin = astronomical_twilight_begin;
	        this.astronomical_twilight_end = astronomical_twilight_end;
	    }
	 
	    private String sunrise;
	    private String sunset;
	    private String solar_noon;
	    private String day_length;
	    private String civil_twilight_begin;
	    private String civil_twilight_end;
	    private String nautical_twilight_begin;
	    private String nautical_twilight_end;
	    private String astronomical_twilight_begin;
	    private String astronomical_twilight_end;

	    public String getSunrise() {
	        return sunrise;
	    }

	    public void setSunrise(String sunrise) {
	        this.sunrise = sunrise;
	    }
	    
	    public String getsunset() {
	        return sunset;
	    }

	    public void setSunset(String sunset) {
	        this.sunset = sunset;
	    }
	    
	    public String getSolar_noon() {
	        return solar_noon;
	    }

	    public void setSolar_noon(String solar_noon) {
	        this.solar_noon = solar_noon;
	    }
	    
	    public String getDay_length() {
	        return day_length;
	    }

	    public void setDay_length(String day_length) {
	        this.day_length = day_length;
	    }
	    
	    
	    public String getCivil_twilight_begin() {
	        return civil_twilight_begin;
	    }

	    public void setCivil_twilight_begin(String civil_twilight_begin) {
	        this.civil_twilight_begin = civil_twilight_begin;
	    }
	    
	    public String getcivil_twilight_end() {
	        return civil_twilight_end;
	    }

	    public void setCivil_twilight_end(String civil_twilight_end) {
	        this.civil_twilight_end = civil_twilight_end;
	    }
	    
	    
	    public String getNautical_twilight_begin() {
	        return nautical_twilight_begin;
	    }

	    public void setNautical_twilight_begin(String nautical_twilight_begin) {
	        this.nautical_twilight_begin = nautical_twilight_begin;
	    }
	    
	    public String getNautical_twilight_end() {
	        return nautical_twilight_end;
	    }

	    public void setNautical_twilight_end(String nautical_twilight_end) {
	        this.nautical_twilight_end = nautical_twilight_end;
	    }
	    
	    public String getAstronomical_twilight_begin() {
	        return astronomical_twilight_begin;
	    }

	    public void setAstronomical_twilight_begin(String astronomical_twilight_begin) {
	        this.astronomical_twilight_begin = astronomical_twilight_begin;
	    }
	    
	    
	    public String getAstronomical_twilight_end() {
	        return astronomical_twilight_end;
	    }

	    public void setAstronomical_twilight_end(String astronomical_twilight_end) {
	        this.astronomical_twilight_end = astronomical_twilight_end;
	    }
	  
	    
	 
}
