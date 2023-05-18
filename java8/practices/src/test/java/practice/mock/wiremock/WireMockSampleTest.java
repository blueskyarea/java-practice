package practice.mock.wiremock;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import practice.mock.wiremock.WireMockSample;

import org.junit.Test;

import com.google.api.client.http.HttpResponse;

public class WireMockSampleTest {
	@Test
	public void testTryToRequest() throws InterruptedException, IOException {
		WireMockSample wireMock = new WireMockSample();
		HttpResponse res = wireMock.tryToRequest();
		assertThat(res.getStatusCode(), is(200));
	}
}
