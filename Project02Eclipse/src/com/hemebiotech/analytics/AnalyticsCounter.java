package com.hemebiotech.analytics;


public class AnalyticsCounter  {
	private static InstantiationIntermediary intermediary = new InstantiationIntermediary();

	/**
	 * This is the entry point of the program
	 * 
	 * @param args
	 * @throws Exception If an input/output error occurs
	 */
	public static void main(String args[]) throws Exception {
		intermediary.start();
	}
}