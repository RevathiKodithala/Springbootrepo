package com.app.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyDetails {
      private List<String> data ;
      private Set<String>models;
      private Map<Integer,String>design;
      private Properties MyInfo;
	public Properties getMyInfo() {
		return MyInfo;
	}
	public void setMyInfo(Properties myInfo) {
		MyInfo = myInfo;
	}
	public MyDetails() {
		super();
	}
	public Map<Integer, String> getDesign() {
		return design;
	}
	public void setDesign(Map<Integer, String> design) {
		this.design = design;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public Set<String> getModels() {
		return models;
	}
	public void setModels(Set<String> models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "MyDetails [data=" + data + ", models=" + models + ", design=" + design + ", MyInfo=" + MyInfo + "]";
	}
	
	
}
