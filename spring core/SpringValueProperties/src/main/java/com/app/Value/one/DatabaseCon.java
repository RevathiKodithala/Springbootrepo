package com.app.Value.one;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("obj")

public class DatabaseCon {
	@Value("${my.dr}")
	private String driver;
	@Value("${my.url}")
	private String url;
	@Value("${my.uname}")
	private String username;
	@Value("${my.pw}")
	private String password;
	@Override
	public String toString() {
		return "DatabaseCon [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}

}
