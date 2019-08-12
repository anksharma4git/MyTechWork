package com.mmt.holiday.mock.service.commons;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mmt.holiday.mock.service.contract.FlightRuleParameterEnum;
import com.mmt.holiday.mock.service.contract.RuleRequest;

public class ResponseUtil {

	public static String getFileNameFromEndPoint(LOB lob, String endPoint, Map<String, String> parameterValueMap) {

		String fileName="";
		switch (lob) {
		case FLIGHTS:
			fileName = lob.lob+MockingConstants.UNDERSCORE+endPoint + MockingConstants.UNDERSCORE + getFormattedString(LOB.FLIGHTS, parameterValueMap);
			
		default:
			break;
		}
		return fileName.replaceAll("/", "_");
	}

	public static String getFileNameToSave(String fileName) {

		return fileName.replaceAll("/", "_");
	}

	public static String getFormattedString(LOB lob, Map<String, String> parameterValueMap) {

		StringBuilder concatenatedString = new StringBuilder();

		switch (lob) {
		case FLIGHTS:
			concatenatedString.append(parameterValueMap.get(FlightRuleParameterEnum.FROM_CITY.toString()))
					.append(MockingConstants.UNDERSCORE)
					.append(parameterValueMap.get(FlightRuleParameterEnum.TO_CITY.toString()));
			break;
		default:
			break;
		}

		return concatenatedString.toString();

	}

	public static RuleRequest getRuleRequest(LOB lob, String endPoint, Map<String, String> parameterValueMap) {
		RuleRequest req = new RuleRequest();

		switch (lob) {
		case FLIGHTS:
			req.setEndPoint(endPoint);
			req.setLob(LOB.FLIGHTS);
			req.setRuleParameterConcatenatedString(getFormattedString(LOB.FLIGHTS, parameterValueMap));

			req.setFileName(LOB.FLIGHTS.lob + MockingConstants.UNDERSCORE + req.getEndPoint()
					+ MockingConstants.UNDERSCORE + req.getRuleParameterConcatenatedString());

			break;

		default:
			break;

		}
		return req;
	}

	public static <T> List<String> getFieldsOfClass(Class<?> classType) {
		List<String> fieldList = new ArrayList<String>();
		for (Field f : classType.getDeclaredFields()) {
			// Modifier.isPrivate(f.getModifiers());

			fieldList.add(f.getName());
		}
		return fieldList;
	}

}
