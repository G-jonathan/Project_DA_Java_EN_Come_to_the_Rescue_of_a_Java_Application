package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public class Proceed {
	
	private ISymptomReader reader;
	private ISymptomsWriter writer;
	
	public Proceed(ISymptomReader reader, ISymptomsWriter writer){
		this.reader = reader;
		this.writer = writer;
	}

	public void go() throws IOException {
		List<String> result = reader.GetSymptoms();
		writer.WriteSymptoms(result);		
	}
}
