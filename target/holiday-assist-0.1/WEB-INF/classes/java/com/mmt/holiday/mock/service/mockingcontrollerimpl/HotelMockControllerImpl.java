package com.mmt.holiday.mock.service.mockingcontrollerimpl;

import java.io.IOException;
import java.util.Map;

import com.mmt.holiday.mock.service.contract.RuleResponse;
import com.mmt.holiday.mock.service.mockingcontroller.LOBMockController;



public class HotelMockControllerImpl implements LOBMockController{

	@Override
	public boolean setResponseForEndpoint(String endPoint,String response) {
		return false;
		
		
	}



	public RuleResponse getRule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResponseForEndpoint(String endPoint, Map<String, String> parameterValueMap) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
