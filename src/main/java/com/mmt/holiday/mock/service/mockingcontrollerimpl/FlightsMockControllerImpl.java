package com.mmt.holiday.mock.service.mockingcontrollerimpl;

import java.io.IOException;
import java.util.Map;

import com.mmt.holiday.mock.service.commons.FileUtil;
import com.mmt.holiday.mock.service.commons.LOB;
import com.mmt.holiday.mock.service.commons.ResponseUtil;
import com.mmt.holiday.mock.service.mockingcontroller.LOBMockController;



public class FlightsMockControllerImpl implements LOBMockController {

	@Override
	public boolean setResponseForEndpoint(String fileName, String response) throws Exception {
		return FileUtil.saveResponseToFile(ResponseUtil.getFileNameToSave(fileName), response);
	}




	@Override
	public String getResponseForEndpoint(String endPoint,Map<String,String>parameterValueMap) throws IOException {
		return FileUtil.getResponseFromEndPoint(LOB.FLIGHTS,endPoint,parameterValueMap);

	}

}
