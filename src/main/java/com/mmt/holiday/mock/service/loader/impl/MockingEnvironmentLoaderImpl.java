package com.mmt.holiday.mock.service.loader.impl;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import com.mmt.holiday.mock.service.loader.MockingEnvironmentLoader;


public class MockingEnvironmentLoaderImpl implements MockingEnvironmentLoader {
	WireMockServer wireMockServer;

	public MockingEnvironmentLoaderImpl() {
		setUpEnviornment();
	}

	@Override
	public void setUpEnviornment() {

		WireMockConfiguration wiremockconfig = new WireMockConfiguration();
		//wireMockServer = new WireMockServer(wiremockconfig.port(8080).extensions(new RequestInterceptor()));
		wireMockServer = new WireMockServer(wiremockconfig.port(8080));
		wireMockServer.start();
		WireMock.configureFor("localhost", 8080);

	}

	public void setupStub() {
		
		wireMockServer.stubFor(requestMatching(new RequestInter()).
				willReturn(aResponse().withBody("hello").withStatus(422)));
		/*wireMockServer.stubFor(requestMatching(new RequestMatcherExtension() {
		    @Override
		    public MatchResult match(Request request, Parameters parameters) {
		        return MatchResult.of(request.getBody().length > 2048);
		    }
		}).willReturn(aResponse().withStatus(422)));
	*/	
		
		
		
		/*
		String response="";
		stubFor(get(urlEqualTo("/makemytrip/flights-search"))
				// .withRequestBody(containing("\"lob\":\"HOLIDAYSPL\""))
				//.withRequestBody()
				.willReturn(aResponse().withStatus(200).withHeader("Content-Type", "application/json")
						.withBody(response)));
		*/
		//wireMockServer.addStubMapping(new StubMapping());
		/*stubFor(requestMatching(new RequestMatcherExtension() {
		    @Override
		    public MatchResult match(Request request, Parameters parameters) {
		        return MatchResult.of(request.getBody().length > 2048);
		    }
		}).willReturn(aResponse().withStatus(422)));*/
	}

	public void shutDown() {
		wireMockServer.stop();
	}
}
