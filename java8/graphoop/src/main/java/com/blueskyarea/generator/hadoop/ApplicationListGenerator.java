package com.blueskyarea.generator.hadoop;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.gson.Gson;

public class ApplicationListGenerator {

	private String apiUrl = "";
	private String proxyHost = "";
	private int proxyPort;
	
	public ApplicationListGenerator() {
	}
	
	public String startToGetList() throws IOException {
		HttpResponse response = getHttpResponse();
		return convertToJson(response);
	}
	
	protected HttpResponse getHttpResponse() throws IOException {
		HttpTransport transport = null;
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
		transport = new NetHttpTransport.Builder().setProxy(proxy).build();
		HttpRequestFactory factory = transport.createRequestFactory();
		HttpRequest request = factory.buildGetRequest(new GenericUrl(apiUrl));
		return request.execute();
	}
	
	protected String convertToJson(HttpResponse response) {
		Gson gson = new Gson();
		
	}
}
