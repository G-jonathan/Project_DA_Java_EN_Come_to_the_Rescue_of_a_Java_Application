package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * Browse a list of symptoms, count their occurrences and generates an output
 * result.
 * 
 * The implementation must eliminate duplicates and sort the result in
 * alphabetical order
 * 
 * @author Jonathan.G
 * @since 0.3
 */
public interface ISymptomsWriter {

	/**
	 * 
	 * @param symptoms A list of symptoms
	 * @throws IOException If an input/output error occurs like a problem with a
	 *                     file, drive or disk access type action
	 */
	void WriteSymptoms (List<String> symptoms) throws IOException;
}