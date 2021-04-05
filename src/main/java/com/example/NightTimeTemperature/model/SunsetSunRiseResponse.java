package com.example.NightTimeTemperature.model;

public class SunsetSunRiseResponse {
	 private String status;
	 private SunsetSunsetResult result;
	 
	 public String getStatus() {
	        return status;
	    }

	 public void setStatus(String status) {
	        this.status = status;
	    }
	 
	 
	 public SunsetSunsetResult getResult() {
	        return result;
	    }

	 public void setResult(SunsetSunsetResult result) {
	        this.result = result;
	    }
}
