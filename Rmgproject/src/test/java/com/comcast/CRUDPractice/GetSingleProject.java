package com.comcast.CRUDPractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSingleProject {
@Test
public void getSingleProjectTest()
{
	Response resp = RestAssured.get("http://localhost:8084/projects/projectname");
	System.out.println(resp.asString());
}
}
