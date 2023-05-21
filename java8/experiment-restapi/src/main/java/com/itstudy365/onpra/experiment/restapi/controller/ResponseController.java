package com.itstudy365.onpra.experiment.restapi.controller;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {
	@PostMapping("/restapi")
	public String responseForRequest(@RequestBody LinkedMultiValueMap<String, String> requestBody) {
		return "Received:" + requestBody.get("name");
	}
	
	@GetMapping("/get")
	public String responseForGetRequest() {
		return "Response for GET request.";
	}
}
