package com.comcast.CRUDPractice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithBDD {
@Test
public void createProjectWithBdd()
{
	JSONObject obj = new JSONObject();
	obj.put("CreatedBy", "Krithika");
	obj.put("projectName", "SDET13");
	obj.put("status", "completed");
	obj.put("teamSize", 25);
	given()
	.contentType(ContentType.JSON)
	.and()
	.body(obj)
    .when()
    .post("http://localhost:8084/addproject")
	.then()
	.assertThat().statusCode(201)
	.log().all();
}
}
