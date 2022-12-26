package com.app.bean.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:properties")

public class SpringConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public SpringConfig dbObj() {
		SpringConfig d = new SpringConfig();
		d.setDriver(env.getProperty("my.app.driver-class"));
		d.setUrl(env.getProperty("my.app.url"));
		return d;

}

	private void setUrl(String property) {
		// TODO Auto-generated method stub
		
	}

	private void setDriver(String property) {
		// TODO Auto-generated method stub
		
	}

}
