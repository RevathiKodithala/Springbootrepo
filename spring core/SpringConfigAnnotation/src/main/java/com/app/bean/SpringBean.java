package com.app.bean;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Setter
@Getter
@ToString
public class SpringBean {
	private String driver;
	public String url;
	/*public SpringBean() {
		super();
	}
	@Override
	public String toString() {
		return "SpringBean [driver=" + driver + ", url=" + url + "]";
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
		//System.out.println("Hello bean");
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}*/

}
