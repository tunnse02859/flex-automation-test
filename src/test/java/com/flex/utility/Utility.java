package com.flex.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	
	public static void pause(long millis){
		try{
			Thread.sleep(millis);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Load config from properties file.
	 * @param fileName
	 * @return Properties configFile
	 */
	public static Properties loadConfig(String fileName) {
		Properties configProperties = null;

		FileInputStream in;
		try {
			in = new FileInputStream(fileName);
			configProperties = new Properties();
			configProperties.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("[Error] File not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[Error] IO exception");
			e.printStackTrace();
		}

		return configProperties;
	}
}
