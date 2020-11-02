package com.hemebiotech.analytics;

import java.io.IOException;

public class Intermediaire {
	
	private static String symptomsFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
	private static String resultfile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/result.out";
	private Proceed go;
	
	public Intermediaire(){
		
		  ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(symptomsFile);
		  WriteSymptomsResultInFile writer = new WriteSymptomsResultInFile(resultfile);
		  go = new Proceed(reader, writer);
	}
	
	public void start() throws IOException{
		go.go();
	}
}
 