package com.hemebiotech.analytics;

import java.io.IOException;

public class InstantiationIntermediary {
	
	private static String symptomsFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
	private static String resultFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/result.out";
	private Processing process;
	
	public InstantiationIntermediary(){
		
		  ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(symptomsFile);
		  WriteSymptomsResultInFile writer = new WriteSymptomsResultInFile(resultFile);
		  process = new Processing(reader, writer);
	}
	
	public void start() throws IOException{
		process.process();
	}
}
 