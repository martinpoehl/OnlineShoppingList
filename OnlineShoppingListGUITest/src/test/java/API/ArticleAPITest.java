package API;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

public class ArticleAPITest {

	@Test
	public void testArticleList() throws ClientProtocolException, IOException {
		HttpUriRequest request = new HttpGet ("http://localhost:8080/articles/list");
		HttpResponse response = HttpClientBuilder.create().build().execute(request);
		assertEquals(200, response.getStatusLine().getStatusCode());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "utf-8"), 8);

		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		for (org.apache.http.Header header : response.getAllHeaders()) {
			System.out.println(header.getName() + "; " + header.getValue());
		}

		System.out.println("Status: " + response.getStatusLine().getStatusCode());
	}

}
