import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comcast.GenericUtils.EndPoints;
import com.comcast.POJOClass.Project;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateMultipleProjectUsingDataParameter {
@Test(dataProvider="provideData")
public void createMUltpileProjects(String createdBy, String projectName,String status,int teamSize)
{
	baseURI="http://localhost";
	port=8084;
	Project proj=new Project(createdBy, projectName, "On-Going", teamSize);
	given()
	.contentType(ContentType.JSON)
	.body(proj)
	.when()
	.post(EndPoints.addProject)
.then()
.assertThat().statusCode(201)
.log().all();
}
@DataProvider
public Object[][] provideData()
{
	Object[][] objArray=new Object[5][3];
	objArray[0][0]="Keer";
	objArray[0][1]="Accenture";
	objArray[0][2]=25;
	
	objArray[1][0]="jann";
	objArray[1][1]="dell";
	objArray[1][2]=26;
	
	objArray[2][0]="roy";
	objArray[2][1]="ibm";
	objArray[2][2]=28;
	
	objArray[3][0]="manoj";
	objArray[3][1]="capgemini";
	objArray[3][2]=26;
	
	objArray[4][0]="daddy";
	objArray[4][1]="tcs";
	objArray[4][2]=23;
	
	return objArray;		
}
}
