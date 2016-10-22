package com.restservice;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestService {

	public static final String BASE_URI = "http://localhost:8080/message?text=hello";

	@Test
	public void printMessageTest()
			throws ClientProtocolException, IOException {

		/*
		 * Test to see if id and content in Message is set based on URL Params and check in response. 
		*/
		
		HttpUriRequest request = new HttpGet(BASE_URI);

		final HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		ObjectMapper objectMapper = new ObjectMapper();
		Message message = objectMapper.readValue(httpResponse.getEntity().getContent(), Message.class);

		assertEquals("hello", message.getContent());
	}
}