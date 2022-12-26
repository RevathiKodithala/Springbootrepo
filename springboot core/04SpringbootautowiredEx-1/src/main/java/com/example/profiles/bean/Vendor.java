package com.example.profiles.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;


@Component
@ToString
	public class Vendor {
       @Value("vname")
		private String vname;
		
	}

