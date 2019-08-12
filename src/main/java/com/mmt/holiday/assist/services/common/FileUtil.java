package com.mmt.holiday.assist.services.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

	public static boolean saveCountToFile(String fileName,String count) throws Exception{
		boolean isFileCreated=false;
		File maintainCountFile=getFileInstance(fileName);
		File tmpFile=getFileInstance("tmpFile");
		
		writeToFile(tmpFile, count);
		
		if(maintainCountFile.exists()){
			maintainCountFile.delete();
			if(tmpFile.renameTo(maintainCountFile)){
				isFileCreated=true;
			}
		}
		
		return isFileCreated;

	}

	

	public static String readFromFile(String file) throws IOException{
		File fileToRead=getFileInstance(file);	
		if(!fileToRead.exists()){
			fileToRead.createNewFile();
			return "1";
		}
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
	
	public static File getFileInstance(String fileName){
		Path currentRelativePath = Paths.get("");		
		return new File(currentRelativePath+File.separator+fileName);
		
	}
}
