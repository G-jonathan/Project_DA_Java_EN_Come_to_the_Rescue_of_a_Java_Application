package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains a method which browse a list of symptoms, counts the
 * occurrences of each symptom and write the result to a file
 * 
 * @author jonathan.G
 * @since 1.0
 */
public class WriteSymptomsResultInFile implements ISymptomsWriter {

	private List<String> arraySymptoms;
	private FileWriter writer;

	/**
	 * Constructor
	 * 
	 * @param arraySymptoms A list of symptoms
	 * @param fileName      The name of the file that will contain the final data
	 * @throws IOException If the named file exists but is a directory rather than a
	 *                     regular file, does not exist but cannot be created, or
	 *                     cannot be opened for any other reason
	 */
	public WriteSymptomsResultInFile(List<String> arraySymptoms, String fileName) throws IOException {
		this.arraySymptoms = arraySymptoms;
		this.writer = new FileWriter(fileName);
	}

	/**
	 * Extract the different symptoms and count their occurrences
	 * 
	 * Each symptom already counted is added to an array which is checked at each
	 * iteration to avoid counting the same symptom several times. Generates a file
	 * containing the list of symptoms and the number of times they appear in the
	 * file
	 * 
	 * @throws IOException If an input/output error occurs like a problem with a
	 *                     file, drive or disk access type action
	 */
	public void WriteSymptoms() throws IOException {
		ArrayList<String> deduplication = new ArrayList<String>();
		Collections.sort(arraySymptoms);

		for (int i = 0; i < arraySymptoms.size(); i++) {

			boolean exist = false;
			int nombre = 0;
			String symptomReading = arraySymptoms.get(i);

			for (int j = 0; j < deduplication.size() && exist == false; j++) {

				String symptomAlreadyCount = deduplication.get(j);

				if (symptomReading.equals(symptomAlreadyCount)) {
					exist = true;
				}
			}
			if (exist == false) {
				for (int k = 0; k < arraySymptoms.size(); k++) {

					String compare = arraySymptoms.get(k);
					if (symptomReading.equals(compare)) {
						nombre += 1;
					}
				}
				writer.write("The symptom: \"" + symptomReading + "\" appears " + nombre + " times." + "\n");
				deduplication.add(symptomReading);
			}
		}
		writer.close();
	}
}
