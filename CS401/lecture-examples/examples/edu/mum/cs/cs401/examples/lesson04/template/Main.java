package edu.mum.cs.cs401.examples.lesson04.template;

public class Main {

	public static void main(String[] args) {

		CSVDataParser csvDataParser = new CSVDataParser();
		csvDataParser.parseDataAndGenerateOutput();
		System.out.println("**********************");
		DatabaseDataParser databaseDataParser = new DatabaseDataParser();
		databaseDataParser.parseDataAndGenerateOutput();
	}

}
