package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * it's the class that will perform the final actions. She receives the
 * necessary objects for processing
 * 
 * @author jonathan.G
 * @since 0.3
 */
public class Processing {
		
	private ISymptomReader reader;
	private ISymptomsWriter writer;
	
	public Processing(ISymptomReader reader, ISymptomsWriter writer){
		this.reader = reader;
		this.writer = writer;
	}
	
	/**
	 * Start reading the input and creating the output
	 * 
	 * @throws IOException If an input/output error occurs like a problem with a
	 *                     file, drive or disk access type action or if the named
	 *                     file exists but is a directory rather than a regular
	 *                     file, does not exist but cannot be created, or cannot be
	 *                     opened for any other reason
	 */
	public void process() throws IOException {
		List<String> result = reader.GetSymptoms();
		writer.WriteSymptoms(result);		
	}
}