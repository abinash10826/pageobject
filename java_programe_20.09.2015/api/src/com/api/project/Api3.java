package com.api.project;

import java.util.ArrayList;


import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.todos;

public class Api3 {
	
	
	public static void main(String[] args) {
		ArrayList<todos> data=new ArrayList<>();
		RestAssured.baseURI="http://jsonplaceholder.typicode.com/todos";
		
		             RequestSpecification httprequest=RestAssured.given();
		               
		             Response response=httprequest.get();
		             
		                     String str=response.getBody().asString();
		                     
		                    //System.out.println(str);
		                     
		                     JSONArray jsonArray=new JSONArray(str);
		                     
		                
		                 
		                 
		                 for (int i = 0; i < 199; i++) {
		                	 
		                	 JSONObject obj=jsonArray.getJSONObject(i);
							todos t=new todos();
							t.setUserId(obj.getInt("userId"));
							t.setId(obj.getInt("id"));
							t.setTitle(obj.getString("title"));
							t.setCompleted(obj.getBoolean("completed"));
							data.add(t);
							
							
						}
		                 System.out.println(data.get(197).getTitle());
		                 
		                 
		                 
		              
		                 
		                
		                             
		                              
		                              
		                          
	}

}
