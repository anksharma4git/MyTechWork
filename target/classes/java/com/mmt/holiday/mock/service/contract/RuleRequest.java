package com.mmt.holiday.mock.service.contract;

import java.util.List;

import com.mmt.holiday.mock.service.commons.LOB;



/**
 * @author MMT5980
 *
 */
public class RuleRequest {
	
	LOB lob;
	String endPoint;
	String ruleParameterConcatenatedString;
	List<String>ruleParameterList;
	String fileName;
	
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public String getRuleParameterConcatenatedString() {
		return ruleParameterConcatenatedString;
	}
	public void setRuleParameterConcatenatedString(String ruleParameterConcatenatedString) {
		this.ruleParameterConcatenatedString = ruleParameterConcatenatedString;
	}
	
	public LOB getLob() {
		return lob;
	}
	public void setLob(LOB lob) {
		this.lob = lob;
	}
	public List<String> getRuleParameterList() {
		return ruleParameterList;
	}
	public void setRuleParameterList(List<String> ruleParameterList) {
		this.ruleParameterList = ruleParameterList;
	}
}
