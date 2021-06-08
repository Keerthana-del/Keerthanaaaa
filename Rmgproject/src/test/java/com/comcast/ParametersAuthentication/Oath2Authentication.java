package com.comcast.ParametersAuthentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oath2Authentication {
@Test
public void oath2AuthenticationTest()
{
	 Response resp = given()
	.formParam("client_id", "Keer12")
	.formParam("client_secret", "b97b80be7f7ba8a79d0712a980db8cd9")
	.formParam("grant_type ", "client_credentials")
	.formParam("redirect_uri ", "http://example.com")
	
	
	.when()
	.post("http://coop.apps.symfonycasts.com/token");
	String token = resp.jsonPath().get("access_token");
	System.out.println(token);
	given()
	.param("USER_ID",1923)
	.auth()
	.oauth2(token)
	.when()
	.post("	http://coop.apps.symfonycasts.com/token/api/{USER_ID}/eggs-collect")
	.then().log().all();
	
	
}
}
