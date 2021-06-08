package com.comcast.RMGyantra;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

import static io.restassured.RestAssured.*;

public class ValidateComplexResponse {
@Test
public void validateComplexResponseProjectName()
{
	String expData="tyss";
	//get all the projects
	Response resp = when()
			.get("http://localhost:8084/projects");
	//Store the static response using json path		
	String actData=resp.jsonPath().get("[0].projectName");
resp.then()
.log().all();
//Validate
Assert.assertEquals(expData, actData);
}
}
