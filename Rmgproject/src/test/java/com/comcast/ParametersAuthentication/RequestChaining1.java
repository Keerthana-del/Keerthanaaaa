package com.comcast.ParametersAuthentication;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.EndPoints;

import io.restassured.response.Response;

public class RequestChaining1 {
	@Test
	public void requestChaining1Test()
	{
		Response resp = when()
				.post("http:/localhost:8084"+EndPoints.getProject);
			String ProjectID = resp.jsonPath().get("[1].projectId");
			given()
			.pathParam("projectID", ProjectID)
			.when()
			.get("http://loacalhost:8084/projects/{projectID}")
			.then()
			.log().all()
			.assertThat().statusCode(200);
		
	}
}
