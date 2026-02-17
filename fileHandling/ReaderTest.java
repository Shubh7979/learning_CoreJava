package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		
		try {
			Reader r = new FileReader("output.txt");
			
			int data = r.read();
			while(data!= -1){
				
				System.out.print((char)data);
				data = r.read();
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
