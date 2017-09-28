package com.example.weatherdata;

public class Weather {
	
	public Weather() {
		
	}

	String stationId, obsevationTime, weather, temperature, wind;

	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public String getObsevationTime() {
		return obsevationTime;
	}

	public void setObsevationTime(String obsevationTime) {
		this.obsevationTime = obsevationTime;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}
	
}
