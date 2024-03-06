package com.internalapps.pmo.StepDef;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class practice
{

	public static void main(String args[]) throws IOException, InterruptedException 
	{
		
		HttpRequest request = HttpRequest.newBuilder()
			    .uri(URI.create("https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/admin/users"))
			    .header("accept", "application/json")
			    .header("content-type", "application/json")
			    .header("authorization", "Bearer def502001f64fdfdc63165f8f62269dba1e133d0727e6ef8c84b9ce32ca18ee0a9f05f7f63f3704af82ed481dcf76956ea382fabf8b66a5668e94d190071d6d1d2e1eed28ac86645eb6d4b0900efcf6e5da9e9dfd87527a2b2da77019089b3be8a2cc8a8f9ff073f8a64933cc54967ce440462c01142766f071771d19fcd37015cb6de198df5be6ed000fd6ef1408f32641769d8746d3539cd52c8b53c3ea442fafafce0")
			    .method("POST", HttpRequest.BodyPublishers.ofString("{\"status\":true,\"userRoleId\":1,\"empNumber\":22,\"username\":\"jenfjce\",\"password\":\"ewfcew@123\"}"))
			    .build();
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			System.out.println(response.body());
		
		
//		HttpRequest request = HttpRequest.newBuilder()
//			    .uri(URI.create("https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/pim/employees"))
//			    .header("accept", "application/json")
//			    .header("content-type", "application/json")
//			    .header("authorization", "Bearer def502001f64fdfdc63165f8f62269dba1e133d0727e6ef8c84b9ce32ca18ee0a9f05f7f63f3704af82ed481dcf76956ea382fabf8b66a5668e94d190071d6d1d2e1eed28ac86645eb6d4b0900efcf6e5da9e9dfd87527a2b2da77019089b3be8a2cc8a8f9ff073f8a64933cc54967ce440462c01142766f071771d19fcd37015cb6de198df5be6ed000fd6ef1408f32641769d8746d3539cd52c8b53c3ea442fafafce0")
//			    .method("POST", HttpRequest.BodyPublishers.ofString("{\"lastName\":\"Leo\",\"firstName\":\"Dee\",\"middleName\":\"D\",\"employeeId\":\"22\"}"))
//			    .build();
//			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//			System.out.println(response.body());
	}
}
