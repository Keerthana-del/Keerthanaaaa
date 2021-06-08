package com.comcast.POJOClass;

public class Project {
	//create global variables for all the keys
String createdBy;
String projectName;
String status;
int teamSize;

//create a paramethorised constructor

public Project(String createdBy,String projectName,String status,int teamSize)
{
	this.createdBy=createdBy;
	this.projectName=projectName;
	this.status=status;
	this.teamSize=teamSize;
}
public String getcreatedBy()
{
	return createdBy;
}
public void setcreatedBy(String createdBy)
{
	this.createdBy= createdBy;
}
public String getprojectName()
{
	return projectName;
}
public void setprojectName(String projectName)
{
	this.projectName=projectName;
}
public String getstatus()
{
	return status;
}
public void setstatus(String status)
{
	
}


public int getteamSize()
{
	return teamSize;
}

}
