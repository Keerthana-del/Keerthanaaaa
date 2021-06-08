package com.comcast.CRUDPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdatedProject {
@Test
public void updateProjectTest()
{
	JSONObject obj = new JSONObject();
	obj.put("CreatedBy", "niharika");
	obj.put("projectName", "SDET13");
	obj.put("status", "On-Going");
	obj.put("teamSize", 25);
	
	given()
	.contentType(ContentType.JSON)
	.and()
	.body(obj)
     .when()
     .put("http://localhost:8084/projects/projectid")
     .then()
     .assertThat().statusCode(200)
	.log().all();
}
}
