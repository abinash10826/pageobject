package com.api.project;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api1 {
	
	public static void main(String[] args) {
		
		//specify the base url to the restful web service
		
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/posts";
		
		// Get the RequestSpecification of the request that you want to sent
				 // to the server
		
		         RequestSpecification httpsRequest=RestAssured.given();
		         
		        /* This will return the Response from the server. Store the response in a variable.*/
		         
		               Response response=httpsRequest.request(Method.GET);
		               
		               //store the response in String using getBody()
		               
		               String responseBody=response.getBody().asString();
		               
		               System.out.println(responseBody);
		               
		                     String s=response.header("Content-Type");
		                     
		                     System.out.println(s+"--------");
		               
		               String s1=response.getStatusLine();
		               
		               System.out.println(s1);
		               
		               int i=response.getStatusCode();
		               
		               System.out.println(i);
		               
		             Headers head=response.headers();
		             
		             for(Header header:head)
		             {
		            	 System.out.println(header.getName()+"------"+header.getValue());
		             }
		            	                
		                     
	}

}
