package com.hemebiotech.analytics;

import java.io.IOException;

/**
 * Used to browse a list of symptoms
 * and generates a file containing each symptoms and the number of times they appear in the file
 * @author Jonathan.G
 * @since 1.0
 */
public interface ISymptomsWriter {
	
	/**
	 * Void method
	 * @throws IOException 
	 */
	void WriteSymptoms () throws IOException;
}