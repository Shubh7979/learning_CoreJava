package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Writer w = new FileWriter("output1.txt");
			
			BufferedWriter bw = new BufferedWriter(w);
			
			String content = "I love you Pune\n";
			
			bw.write(content);
			bw.append("I like to live in pune");
			bw.close(); // REQUIRED

			
			System.out.println("Buffered write successful");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
