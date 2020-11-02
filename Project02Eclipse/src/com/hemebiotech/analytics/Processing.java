package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public class Processing {
	
	private ISymptomReader reader;
	private ISymptomsWriter writer;
	
	public Processing(ISymptomReader reader, ISymptomsWriter writer){
		this.reader = reader;
		this.writer = writer;
	}

	public void process() throws IOException {
		List<String> result = reader.GetSymptoms();
		writer.WriteSymptoms(result);		
	}
}