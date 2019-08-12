package com.mmt.holiday.mock.service.loader.impl;

import java.util.Set;

import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.matching.MatchResult;
import com.github.tomakehurst.wiremock.matching.RequestMatcher;

public class RequestInter extends RequestMatcher {

	/*@Override
	public MatchResult match(Request request, Parameters params) {
		System.out.println("client IP: "+request.getClientIp());
		return MatchResult.of(request.getUrl().contains("flight"));
	}*/

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatchResult match(Request request) {
		Set<String>headerKey=request.getAllHeaderKeys();
		
		//request.get
		return null;
	}

}
