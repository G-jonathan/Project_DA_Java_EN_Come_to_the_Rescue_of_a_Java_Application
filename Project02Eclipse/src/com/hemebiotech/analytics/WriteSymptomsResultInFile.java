package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * This class contains a method which browse a list of symptoms, counts the
 * occurrences of each symptom and write the result to a file
 * 
 * @author jonathan.G
 * @since 0.3
 */
public class WriteSymptomsResultInFile implements ISymptomsWriter {

	private FileWriter writer;
	
	/**
	 * Constructor
	 * 
	 * @param fileName      The name of the file that will contain the final data
	 * @throws IOException If the named file exists but is a directory rather than a
	 *                     regular file, does not exist but cannot be created, or
	 *                     cannot be opened for any other reason
	 */
	public WriteSymptomsResultInFile(String fileName) {
		try {
			this.writer = new FileWriter(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Extract the different symptoms and count their occurrences
	 * 
	 * TreeSet is used to have a sorted symptoms list version without duplicates
	 * Then for each symptom, we count the occurrences in the original array
	 * 
	 * @param symptoms A list of symptoms
	 * @exception If an input/output error occurs like a problem with a file, drive
	 *               or disk access type action
	 */
	public void WriteSymptoms(List<String> symptoms) {
		final TreeSet<String> symptomsWithoutDuplicates = new TreeSet<String>(symptoms);
		try {
			for (String symptomReading : symptomsWithoutDuplicates) {
				int frequency = Collections.frequency(symptoms, symptomReading);
				writer.write("The symptom: \"" + symptomReading + "\" appears " + frequency + " times." + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}