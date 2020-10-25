package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {

	private static String symptomsFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
	/**
	 * This is the entry point of the program
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(symptomsFile);
		List<String> result = read.GetSymptoms();
		
		WriteSymptomsResultInFile write = new WriteSymptomsResultInFile(result);
		write.WriteSymptoms();
	}
}
