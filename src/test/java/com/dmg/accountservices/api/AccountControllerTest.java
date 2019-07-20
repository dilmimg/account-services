package com.dmg.accountservices.api;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.test.context.junit4.SpringRunner;

import com.dmg.accountservices.AccountServicesApplication;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountServicesApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerTest {
	
	@LocalServerPort
	private int port;
	
	private TestRestTemplate restTemplate;
	
	private HttpEntity<String> httpEntity;
	
	@Before
	public void setUp() {
		
		restTemplate = new TestRestTemplate();
		
		httpEntity = new HttpEntity<String>(null, new HttpHeaders());
	}
	
	@Test
	public void testRetrieveAllAccounts() throws JSONException {

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/accounts"),
				HttpMethod.GET, httpEntity, String.class);

		String expectedResponse = "[{accountId:10001,accountNumber:\"568728234\",accountName:\"SGSavings875\"}, {accountId:10002,accountNumber:\"782347212\",accountName:\"AUSavings555\"}, {accountId:10003,accountNumber:\"129089890\"}]";

		JSONAssert.assertEquals(expectedResponse, response.getBody(), false);
	}
	
	@Test
	public void testRetrieveTransactionsByAccount() throws JSONException {

		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/accounts/10003/transactions"),
				HttpMethod.GET, httpEntity, String.class);

		String expectedResponse = "[{accountNumber:\"129089890\",accountType:\"Current\",trasactionDate:\"03-03-2018\"}, {accountNumber:\"129089890\",accountType:\"Current\",trasactionDate:\"19-04-2019\"}]";
		
		JSONAssert.assertEquals(expectedResponse, response.getBody(), false);
	}
	
	
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
