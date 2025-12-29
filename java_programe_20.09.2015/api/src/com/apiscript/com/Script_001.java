package com.apiscript.com;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.apiUtil.com.EndPointURL;
import com.apiUtil.com.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.webservices.method.WebServices;

import io.restassured.response.Response;

public class Script_001 {
	
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList<>();
		 
		Response response;
		 
		       Gson gson=new GsonBuilder().create();
		       
		       ApiObjects[] api;

		      String url=URL.fixURL+EndPointURL.GET_DATA.getResourcePath();
		    
		      response=WebServices.Get(url);
		      
		      String header=response.header("server");
		      System.out.println(header);
		      System.out.println(response.header("content-type"));
		      System.out.println(response.header("content-encoding"));
		      System.out.println(response.statusCode());
		      System.out.println(response.statusLine());
		      System.out.println(response.getStatusCode());
		      
		    /*  String result=response.getBody().asString();
		      
		               api=gson.fromJson(result, ApiObjects[].class);
		               
		               for (int i = 0; i <4; i++) {
		            	   
		            	   list.add(api[i].getTitle());
		            	   
						
					}
		               
		               
		               System.out.println(list);
		      */
		    
		    	           
		    	           
				
		
		      
		      
		      
	
	}

}
