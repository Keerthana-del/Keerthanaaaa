package com.comcast.RMGyantra;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class ValidateComplexDynamicResponse {
@Test
public void validateComplexDynamicResponseTest()
{
	String expData="SANTHOSH";
	//get all the projects
	Response resp = when().get("http://l0ocalhost:8084/projects");
 //store the json path in list
	List<String> list = resp.jsonPath().get("createdBy");
	for(String str:list)
	{
		if(str.equalsIgnoreCase(expData))
		{
			System.out.println(expData+"is present in dynamic response");
			break;
		}
	    
	}
	
resp.then().log().all();
	}
}
