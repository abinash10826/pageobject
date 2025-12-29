package com.api.project;


import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiPost {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/posts";
		
		  RequestSpecification httprequest=RestAssured.given();
		  
		 // JSONObject requestParams = new JSONObject();	
		  
		  JsonObject hhdd=new JsonObject();
		  
		  hhdd.addProperty("userId", "11");
		  hhdd.addProperty("id", "102");
		  
		               httprequest.body(hhdd.toString());
		               
		               Response response=httprequest.post();
		               
		               int i =response.statusCode();
		               System.out.println(i);
		               
		               String s=response.jsonPath().get("SuccessCode");
		               
		               System.out.println(s);
		               
		               
		               
		               
		               
		            	  
		               
		                 
	}
	
	

}
