package com.webservices.method;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebServices {
	
	
	public static Response Post(String uRI,String stringJson)
	{
		RequestSpecification requestSpesification=RestAssured.given().body(stringJson);
	    requestSpesification.contentType(ContentType.JSON);
	    Response response=requestSpesification.post(uRI);
	    
	    return response;
	}
	
	
	public static Response Get(String uRI)
	{
		RequestSpecification requestSpesification=RestAssured.given();
	    requestSpesification.contentType(ContentType.JSON);
	    Response response=requestSpesification.get(uRI);
	    
	    return response;
	}
	
	public static Response Put(String uRI,String stringJson)
	{
		RequestSpecification requestSpecification=RestAssured.given().body(stringJson);
		requestSpecification.contentType(ContentType.JSON);
		Response response=requestSpecification.put(uRI);
		
		return response;
	}
	
	public static Response Delete(String uRI)
	{
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        Response response=requestSpecification.delete(uRI);
        
        return response;
	}
	
	

}
