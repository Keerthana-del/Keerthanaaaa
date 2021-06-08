package com.comcast.ParametersAuthentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuth {
@Test
public void basicAuthTest()
{
given()
.auth()
.basic("rmgyantra", "rmgy@9999")
.when()
.get("http://localhost:8084/projects")
.then()
.log().all()
.assertThat().statusCode(200);
}
}
