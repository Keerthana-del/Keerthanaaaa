package com.comcast.ParametersAuthentication;

import org.testng.annotations.Test;

import com.comcast.GenericUtils.EndPoints;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameters {
@Test
public void formParametersTest()
{
 given()
 .contentType(ContentType.JSON)
 .formParam("first_name", "keer")
 .formParam("projectName", "dell")
 .formParam("status", "On-going")
 .formParam("teamSize", 32)
 .when()
  .post("http://localhost:8084"+EndPoints.addProject)
  .then()
  .log().all()
  .assertThat().statusCode(201);
}
}
