package com.example.profiles.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.profiles.bean.Vendor;

import lombok.ToString;


@Component
@ToString
public class Product {
	 
	@Autowired
	private Vendor vobj;

		

	}


