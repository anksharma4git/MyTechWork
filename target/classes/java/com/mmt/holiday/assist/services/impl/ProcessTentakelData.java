package com.mmt.holiday.assist.services.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.testng.annotations.Test;

import com.mmt.holiday.assist.services.common.Constants;

public class ProcessTentakelData {

	@Test
	public void testProcessData() throws IOException{
		File f =new File ("raw.txt");
		FileReader fileReader = new FileReader(f);
		BufferedReader reader = new BufferedReader(fileReader);
		StringBuilder filteredString = new StringBuilder();
		
		try {
			String line = null;
			String requestString;
			while ((line = reader.readLine()) != null) {
				boolean patternFound=false;
				if (line.contains(Constants.REVIEW_REQUEST_URL_PATTERN)) {
					patternFound=true;
					
					do {
						requestString = reader.readLine();
						filteredString.append(requestString).append(System.lineSeparator());
					} while (!requestString.contains(Constants.REVIEW_REQUEST_END_PATTERN));
					
				}
				if(patternFound){
					System.out.println("\n\n"+filteredString.toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			reader.close();
		}
		
	}
	public void getProcessedTentakelData(String rawData) {
		StringBuilder filteredString = new StringBuilder();
		BufferedReader reader = new BufferedReader(new StringReader(rawData));
		try {
			String line = null;
			while ((line = reader.readLine()) != null) {
				if (line.equals(Constants.REVIEW_REQUEST_URL_PATTERN)) {
					String requestString = reader.readLine();
					do {
						filteredString.append(requestString);
					} while (requestString.contains(Constants.REVIEW_REQUEST_END_PATTERN));
					System.out.println(filteredString.toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
