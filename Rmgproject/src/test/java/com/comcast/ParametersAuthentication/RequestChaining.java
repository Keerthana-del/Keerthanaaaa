package com.comcast.ParametersAuthentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.EndPoints;

import io.restassured.response.Response;

public class RequestChaining {
@Test
public void requestChainingTest()
{
	Response resp = when()
	.get("http:/localhost:8084"+EndPoints.getProject);
String firstProjectID = resp.jsonPath().get("[1].projectId");
given()
.pathParam("projectID", firstProjectID)
.when()
.delete("http://loacalhost:8084/projects/{projectID}")
.then()
.log().all()
.assertThat().statusCode(204);
	
}
}
