package com.api.project;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class parsenested {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/users/1";
		
		         RequestSpecification httprequest=RestAssured.given();
		             
		          Response respone=httprequest.get();
		          String result=respone.getBody().asString();
		          
		          //System.out.println(result);
		          
		          JSONObject jsonobj=new JSONObject(result);
		          
		                    jsonobj.getJSONObject("company");
		                    
		                    System.out.println(jsonobj.toString());
		          
		          		        	  
		        	  
					
				
		          
		        
	}

}
