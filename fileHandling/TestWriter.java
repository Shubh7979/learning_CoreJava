package fileHandling;

import java.io.FileWriter;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) {
		
		try {
			
			Writer w = new FileWriter("output.txt");
			
			String content = "I like PUNE";
			
			
			w.write(content);
			w.append("\nI like anime"); //append is used to not keep old data and write for override data
			
			
			w.close();
			
			System.out.println("write successful");
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
