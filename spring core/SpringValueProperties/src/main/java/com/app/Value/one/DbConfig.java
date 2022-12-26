package com.app.Value.one;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.Value.one")
@PropertySource("classpath:config.properties")
public class DbConfig {
	

}
