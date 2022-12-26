package com.app.ref;

public class SpringBeanref {
	private String driver;
	private String url;
	public SpringBeanref() {
		super();
	}
	@Override
	public String toString() {
		return "SpringBeanref [driver=" + driver + ", url=" + url + "]";
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
