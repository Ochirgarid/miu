package prob2;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Logger;


public class NewFileIO {
    private static final Logger LOG = Logger.getLogger(OldFileIO.class.getName());
	public final static String FILE_LOCATION = "src/prob2/output.txt";
	public final static String TO_PRINT = "This is the string to print to file.";
	
	void writeText(String filename, String text) {        
        try (PrintWriter writer = new PrintWriter(new FileWriter(new File(filename)))) {
            writer.print(text);
        } catch(IOException e) {
			LOG.warning("IOException attempting to write a file: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		OldFileIO old = new OldFileIO();
	    old.writeText(FILE_LOCATION, TO_PRINT);
		
	}
}
