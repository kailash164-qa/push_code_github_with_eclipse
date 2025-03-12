package com.gspan.RestAssuredEx1;

public class Location{
	
	
	private String lat,lang;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Location(String lat, String lang) {
		super();
		this.lat = lat;
		this.lang = lang;
	}

	@Override
	public String toString() {
		return "Location [lat=" + lat + ", lang=" + lang + "]";
	}
}
