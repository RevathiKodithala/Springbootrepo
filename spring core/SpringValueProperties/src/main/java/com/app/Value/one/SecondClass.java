package com.app.Value.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sobj")
public class SecondClass {
	@Override
	public String toString() {
		return "SecondClass [dvar=" + dvar + "]";
	}
   @Autowired
	private DatabaseCon dvar;

}
