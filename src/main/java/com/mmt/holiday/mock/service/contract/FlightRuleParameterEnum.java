package com.mmt.holiday.mock.service.contract;

public enum FlightRuleParameterEnum {

	FROM_CITY("fromCity"), TO_CITY("toCity");

	String ruleParameter;

	FlightRuleParameterEnum(String ruleParameter) {
		this.ruleParameter = ruleParameter;
	}

}
