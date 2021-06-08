package com.comcast.CRUDPractice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUsingHaspMap {
   
	@Test
	public void createProjectWithHaspMapTest()
	{
		HashMap hash=new HashMap<>();
		hash.put("createdBy", "Newton");
		hash.put("projectName", "DELL");
		hash.put("status", "completed");
		hash.put("teamSize", 25);
		given()
		.contentType(ContentType.JSON)
		//.and()
		.body(hash)
		.when()
		.post("http://localhost:8084+EndPoints.addProject")
		.then()
		.assertThat().statusCode(201)
		.log().all();
		
	}
	
	
}
