package com.comcast.ParametersAuthentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerToken {
@Test
public void bearerTokenTest()
{
	HashMap map=new HashMap();
	map.put("name", "Keer");
	given()
	.auth()
	.oauth2("")
	.body(map)
	.when()
	.post("htt")
	.then()
	.log().all()
	.assertThat().statusCode(201);
	
}
}
