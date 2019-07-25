package com.apiUtil.com;

public enum EndPointURL {


	GET_DATA("/posts/1");
	
	String resoursePath;
	
	 EndPointURL(String resoursePath) {
		 
		 this.resoursePath=resoursePath;
		
	}
	 
	 public String getResourcePath()
	 {
		 return this.resoursePath;
	 }
	 
	 public String getResourcePath(String data)
	 {
		 return this.resoursePath+data;
	 }
}
