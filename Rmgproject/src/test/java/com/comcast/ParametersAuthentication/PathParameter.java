package com.comcast.ParametersAuthentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
@Test
public void pathParameterTest()
{
	given()
	.pathParam("projectID", "TY_PROJ_001")
	.when()
	.get("http://localhost:8084/projects/projectID")
	.then()
	.log().all()
	.assertThat().statusCode(200);
}
}
