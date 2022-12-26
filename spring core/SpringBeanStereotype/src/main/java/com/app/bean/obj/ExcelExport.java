package com.app.bean.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExcelExport {
	@Value("Oracle")
	private String driver;
	@Value("HP")
	private String laptop;
	@Override
	public String toString() {
		return "ExcelExport [driver=" + driver + ", laptop=" + laptop + "]";
	}
	

}
