package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;


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
	void WriteSymptoms (List<String> symptoms) throws IOException;
}