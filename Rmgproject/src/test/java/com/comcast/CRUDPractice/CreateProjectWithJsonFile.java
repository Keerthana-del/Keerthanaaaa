package com.comcast.CRUDPractice;

import java.io.File;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.EndPoints;
import com.comcast.GenericUtils.IConstants1;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class CreateProjectWithJsonFile {

@Test
public void createProjectWithJsonFileTest()
{
	baseURI="http://localhost";
	port=8084;
	File file=new File(IConstants1.JSONpath);
		given()
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post(EndPoints.addProject)
		.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	
			
}
}
