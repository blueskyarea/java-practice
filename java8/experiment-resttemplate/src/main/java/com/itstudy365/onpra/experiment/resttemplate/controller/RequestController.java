package com.itstudy365.onpra.experiment.resttemplate.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RequestController {
	@GetMapping("/sameinstance")
	public String requestWithSameInstance() {
		Long startTime = System.currentTimeMillis();
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8082/restapi";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setConnection("close");
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("name", "someone");
		map.add("email", "first.last@example.com");
		
		for (int i = 0; i < 1000; i++) {
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
			System.out.println(response);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (endTime - startTime));
		return "Complated to access with sameinstance";
	}
	
	@GetMapping("/newinstance")
	public String requestWithNewInstance() {
		Long startTime = System.currentTimeMillis();
		String url = "http://localhost:8082/restapi";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("email", "first.last@example.com");
		
		for (int i = 0; i < 1000; i++) {
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
			ResponseEntity<String> response = restTemplate.postForEntity(url, request, String.class);
			System.out.println(response);
		}
		Long endTime = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (endTime - startTime));
		return "Complated to access with newinstance";
	}
}
