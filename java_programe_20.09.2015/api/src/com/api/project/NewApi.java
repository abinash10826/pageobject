package com.api.project;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NewApi {
	@Test 
	
	public void apiTestingTest()
	{
		int actCode=200;
		
		RestAssured.baseURI="http://api.androidhive.info/contacts";
		
		//modify the request
		
	 RequestSpecification httpRequest=RestAssured.given();
	 
	 //get the respone back from the server
	 
	   Response response=httpRequest.get();
	   
	   //read the responce
	   
	   String responseBody=response.getBody().asString();
	   
	   System.out.println(responseBody);
	   
	   System.out.println("-----------------");
	   
	   //get the status code
	   
	   int statuscode=response.getStatusCode();
	   
	   System.out.println(statuscode);
	   
	   System.out.println("------------------");
	   //verify the status code 
	   
	  assertEquals(actCode, 200);
	  
	  Reporter.log("----Status Code ==> Pass----");
	  
	  //verify the status line
	  
	   String result=response.getStatusLine();
	        
	   System.out.println(result);
	   
	   assertEquals(result, "HTTP/1.1 200 OK");
	   
	   Reporter.log("----StatusLine ==> Pass----");
	   
	   System.out.println("--------------------");
	   
	   //get all the header
	   
	   Headers head=response.getHeaders();
	   
	   for(Header header:head)
	   {
		   System.out.println(header.getName()+header.getValue());
	   }
	        
	        
	   
	   
	}

}
