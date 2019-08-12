package com.mmt.holiday.mock.service.mockingcontroller;

import java.io.IOException;
import java.util.Map;


public interface LOBMockController {
	
	public boolean setResponseForEndpoint(String endPoint,String response) throws Exception;
	public String getResponseForEndpoint(String endPoint,Map<String,String>parameterValueMap) throws IOException;
	//public <T> T getRule(); 
}
