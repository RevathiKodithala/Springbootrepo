package com.app.Value.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tobj")
public class ThirdClass {
	@Override
	public String toString() {
		return "ThirdClass [cls=" + cls + "]";
	}
    @Autowired
	private SecondClass cls;

}
