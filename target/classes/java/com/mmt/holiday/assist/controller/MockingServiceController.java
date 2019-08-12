package com.mmt.holiday.assist.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/mocking-service")
public class MockingServiceController {

	
	@GET
	@Path("try")
	@Produces(MediaType.TEXT_PLAIN)
	public String getValue(){
		return "hello";
	}

}
