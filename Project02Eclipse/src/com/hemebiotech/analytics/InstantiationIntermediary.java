package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Create the objects of the classes necessary for data processing
 * 
 * @author jonathan.G
 * @since 0.3
 */
public class InstantiationIntermediary {

	private static String symptomsFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";
	private static String resultFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/result.out";
	private Processing launch;
	
	public InstantiationIntermediary(){
		
		  ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(symptomsFile);
		  WriteSymptomsResultInFile writer = new WriteSymptomsResultInFile(resultFile);
		  launch = new Processing(reader, writer);
	}
	
	/**
	 * Start the function which will read the input and create the output
	 * 
	 * @throws IOException If an input/output error occurs like a problem with a
	 *                     file, drive or disk access type action or if the named
	 *                     file exists but is a directory rather than a regular
	 *                     file, does not exist but cannot be created, or cannot be
	 *                     opened for any other reason
	 */
	public void start() throws IOException{
		launch.process();
	}
}