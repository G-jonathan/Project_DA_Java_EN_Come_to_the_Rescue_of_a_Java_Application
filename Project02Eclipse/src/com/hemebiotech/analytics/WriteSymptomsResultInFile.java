package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteSymptomsResultInFile {
	private List<String> arraySymptoms;

	public WriteSymptomsResultInFile(List<String> arraySymptoms) {
		this.arraySymptoms = arraySymptoms;
	}

	public void WriteSymptoms() throws IOException {
		FileWriter writerTest = new FileWriter("result_test.out");
		ArrayList<String> deduplication = new ArrayList<String>();

		for (int i = 0; i < arraySymptoms.size(); i++) { // browse all the table

			boolean exist = false;
			int nombre = 0;
			String symptomReading = arraySymptoms.get(i);

			for (int j = 0; j < deduplication.size() && exist == false; j++) { // for each iteration, i look if the data exist in deduplication table

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
				deduplication.add(symptomReading);
				writerTest.write("number of " + symptomReading + " is " + nombre + "\n");
			}
		}
		writerTest.close();
	}
}
