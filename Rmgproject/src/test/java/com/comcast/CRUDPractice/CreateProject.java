package com.comcast.CRUDPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {

	@Test
	public void createProjectTest()
	{
		JSONObject obj = new JSONObject();
		obj.put("CreatedBy", "niharika");
		obj.put("projectName", "SDET13");
		obj.put("status", "completed");
		obj.put("teamSize", 25);
		
		RequestSpecification res=RestAssured.given();
	    res.contentType(ContentType.JSON);
		res.body(obj);
	    Response response = res.post("http://localhost:8084/addProject");
	    System.out.println(response.getStatusCode());
	}
}
