package com.itstudy365.onpra.experiment.httpclientapi.controller;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
	@GetMapping("/get")
	public String requestWithSync() {
		System.out.println("requestWithSync");
		Long startTime = System.currentTimeMillis();
		// Create an instance of HttpClient
		HttpClient client = HttpClient.newHttpClient();
		
		// Create a HTTP request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8082/get"))
				.GET()
				.build();
		
		// Send the HTTP request and retrieve the response
		try {
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
			
			// Get the response status code and body
			int statusCode = response.statusCode();
			String responseBody = response.body();
			
			System.out.println("Status Code: " + statusCode);
			System.out.println("Response Body: " + responseBody);
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
			Long endTime = System.currentTimeMillis();
			System.out.println("Elapsed time: " + (endTime - startTime));
		}
		return "Complated to get.";
	}
}
