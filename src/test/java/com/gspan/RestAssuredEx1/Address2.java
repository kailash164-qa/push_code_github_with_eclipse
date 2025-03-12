package com.gspan.RestAssuredEx1;

public class Address2{
	private String city,street,zipcode; 
	private Integer flatNumber;
	private Location geoLocation;
	
	public Address2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address2(String city, String street, String zipcode, Integer flatNumber, Location geoLocation) {
		super();
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
		this.flatNumber = flatNumber;
		this.geoLocation = geoLocation;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Integer getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(Integer flatNumber) {
		this.flatNumber = flatNumber;
	}

	public Location getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(Location geoLocation) {
		this.geoLocation = geoLocation;
	}

	@Override
	public String toString() {
		return "Address2 [city=" + city + ", street=" + street + ", zipcode=" + zipcode + ", flatNumber=" + flatNumber
				+ ", geoLocation=" + geoLocation + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}