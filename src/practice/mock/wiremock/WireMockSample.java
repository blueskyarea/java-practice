package practice.mock.wiremock;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;

import java.io.IOException;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.javanet.NetHttpTransport;

public class WireMockSample {
	
	public WireMockSample() {
		WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().port(8089));
		wireMockServer.start();
		WireMock.configureFor("localhost", wireMockServer.port());
		stubFor(get(urlEqualTo("/test")).willReturn(aResponse().withStatus(200)));
	}
	
	public HttpResponse tryToRequest() throws InterruptedException, IOException {
		HttpRequestFactory fac = (new NetHttpTransport()).createRequestFactory();
		return fac.buildGetRequest(new GenericUrl("http://localhost:8089/test")).execute();
	}
}
