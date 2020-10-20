package com.hemebiotech.analytics;

//import java.io.FileWriter;
import java.util.List;

public class AnalyticsCounter {

	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int dialatedpupilCount = 0;
	private static int unknown =0;
	private static int constrictedpupils =0;

	private static String symptomsFile = "../Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt";

	public static void main(String args[]) throws Exception {
		// first get input

		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile(symptomsFile);
		List<String> result = read.GetSymptoms();

		for (byte i = 0; i < result.size(); i++) {
			switch (result.get(i)) {
			case "headache":
				headacheCount++;
				break;
			case "dialated pupils":
				dialatedpupilCount++;
				break;
			case "constricted pupils":
				constrictedpupils++;
				break;
			case "rash":
				rashCount++;
				break;
			default: unknown++;
				break;
			}
			int pupils = constrictedpupils + dialatedpupilCount;
			System.out.println(result.get(i));
			System.out.println("number of headaches: " + headacheCount);
			System.out.println("number of dialated pupils: " + dialatedpupilCount);
			System.out.println("number of rash: " + rashCount);
			System.out.println("number of unknown: " + unknown);
			System.out.println("number of constricted pupils: " + constrictedpupils);
			System.out.println("number of pupils: " + pupils);
		}
		/*
		while (line != null) {
			System.out.println("symptom from file: " + line);
				headacheCount++;
				System.out.println("number of headaches: " + headacheCount);
			}
			else if (line.equals("rash")) {
				rashCount++;
			}
			else if (line.contains("pupils")) {
				pupilCount++;
			}
			line = reader.readLine();	// get another symptom
		}
		reader.close();
		
		
		// next generate output
		FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();
		*/
	}
}
