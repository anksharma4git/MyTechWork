package com.mmt.holiday.assist.ssh.tunnel.tentakel;

public class TentakelData {

	TentakelGroup group;
	String textToSearch;
	String dateToLookup;
	public String getDateToLookup() {
		return dateToLookup;
	}
	public void setDateToLookup(String dateToLookup) {
		this.dateToLookup = dateToLookup;
	}
	
	public TentakelGroup getGroup() {
		return group;
	}
	public void setGroup(TentakelGroup group) {
		this.group = group;
	}
	public String getTextToSearch() {
		return textToSearch;
	}
	public void setTextToSearch(String textToSearch) {
		this.textToSearch = textToSearch;
	}
	
}
