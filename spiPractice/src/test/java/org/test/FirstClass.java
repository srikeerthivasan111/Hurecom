package org.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstClass {
	
	@Test
	private void GetMethod() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		
		RequestSpecification given = RestAssured.given();
		
		Response request = given.request(Method.GET,"/employees");
		
		System.out.println(request);
		System.out.println(request.getStatusLine());
		System.out.println(request.asPrettyString());
		
		
		 
	}
	
	@Test
	private void postmethod() {
 
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		
		RequestSpecification given = RestAssured.given().header("ContentType.TEXT","applicaton/json")
				.body("{\r\n"
						+ "    \"status\": \"success\",\r\n"
						+ "    \"data\": {\r\n"
						+ "        \"name\": \"test\",\r\n"
						+ "        \"salary\": \"123000\",\r\n"
						+ "        \"age\": \"26\",\r\n"
						+ "    }") 		;		
		Response request = given.request(Method.PUT,"/employees");
		
		System.out.println(request);
		System.out.println(request.getStatusLine());
		System.out.println(request.asPrettyString());
	}
	

}
