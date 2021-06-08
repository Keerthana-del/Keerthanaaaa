package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleProjectTest {
@Test
public void getAllProjectTest()
{
	Response resp = RestAssured.get("http://localhost:8884/projects");
    System.out.println(resp.asString());
    resp.prettyPrint();
    resp.then().log().all();
}
}
