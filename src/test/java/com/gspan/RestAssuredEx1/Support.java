package com.gspan.RestAssuredEx1;

public class Support {
	
	  public Support() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Support(String url, String text) {
		super();
		this.url = url;
		this.text = text;
	}
	@Override
	public String toString() {
		return "Support [url=" + url + ", text=" + text + "]";
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String url;
	    public String text;

}
