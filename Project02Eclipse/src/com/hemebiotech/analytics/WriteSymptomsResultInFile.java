package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains a method which browse a list of symptoms,
 * counts the occurrences of each symptom and write the result to a file
 * @author jonathan.G
 * @since 1.0
 */
public class WriteSymptomsResultInFile implements ISymptomsWriter{
	
	private List<String> arraySymptoms;
	
	/**
	 * Constructor
	 * @param arraySymptoms A list of symptoms
	 */
	public WriteSymptomsResultInFile(List<String> arraySymptoms) {
		this.arraySymptoms = arraySymptoms;
	}
	
	/**
	 * Extract the differents symptoms and count their occurrences
	 * Generates a file containing the list of symptoms and the number of times they appear in the file
	 * @throws IOException 
	 */
	public void WriteSymptoms() throws IOException {
		FileWriter writer = new FileWriter("result.out");
		ArrayList<String> deduplication = new ArrayList<String>();

		for (int i = 0; i < arraySymptoms.size(); i++) { // browse all the arraySymptoms array

			boolean exist = false;
			int nombre = 0;
			String symptomReading = arraySymptoms.get(i);

			for (int j = 0; j < deduplication.size() && exist == false; j++) { // for each iteration, we look if the data exist in deduplication array

				String symptomAlreadyCount = deduplication.get(j);

				if (symptomReading.equals(symptomAlreadyCount)) { // if the data already exist in deduplication array
					exist = true;
				}
			}
			if (exist == false) { // if the data doesn't exist in deduplication array
				for (int k = 0; k < arraySymptoms.size(); k++) { // we browse the arraySymptoms array to count the number of occurrences

					String compare = arraySymptoms.get(k); 
					if (symptomReading.equals(compare)) {
						nombre += 1;
					}
				}
				writer.write("The symptom: \"" + symptomReading + "\" appears " + nombre + " times." + "\n"); // we write the symptom and its number in the file
				deduplication.add(symptomReading); // then we add this data in deduplication array to no longer have to count it	
			}
		}
		writer.close();
	}
}
