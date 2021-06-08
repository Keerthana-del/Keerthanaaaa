package com.comcast.CRUDPractice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProjectWithBDD {
@Test
public void deleteProjectWithBddTest()
{
when()
.delete("http://localhost:8084/projects/projectid")
.then()
.assertThat().contentType(ContentType.JSON)
.log().all();

}

}
