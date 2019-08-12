package com.mmt.holiday.mock.service.commons;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class FileUtil {

	public static boolean saveResponseToFile(String fileName,String serviceResponse) throws Exception{
		File mockedResponseFile=getFileInstance(fileName);
		boolean isFileCreated=false;
		if(!mockedResponseFile.exists()){
			mockedResponseFile.createNewFile();
			isFileCreated=true;
			writeToFile(mockedResponseFile, serviceResponse);
		}else{
			throw new Exception("File already present !");
		}
		
		return isFileCreated;

	}
	
	public static String getResponseFromEndPoint(LOB lob,String endPoint,Map<String,String>parameterValueMap) throws IOException{
		
		String fileToRead=ResponseUtil.getFileNameFromEndPoint(lob,endPoint,parameterValueMap);
		
		return readFromFile(getFileInstance(fileToRead));
		
	}
	

	private static String readFromFile(File fileToRead) throws IOException{
		BufferedReader reader=new BufferedReader(new FileReader(fileToRead));
		String currentLine;
		StringBuilder content=new StringBuilder();
			while ((currentLine = reader.readLine()) != null) {
				content.append(currentLine);
			}
			reader.close();
		return content.toString(); 
	}
	
	public static void writeToFile(File fileToWrite,String content){
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(fileToWrite);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(content);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (bufferedWriter != null)
					bufferedWriter.close();

				if (fileWriter != null)
					fileWriter.close();

			} catch (Exception ex) {

				ex.printStackTrace();

			}
		}

	}
	
	private static File getFileInstance(String fileName){
		Path currentRelativePath = Paths.get("src","main","java","com","mmt","holiday","mock","service","response");	
		return new File(currentRelativePath.toString()+File.separator+fileName+".txt");
		
	}
}
