package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReeaderDemo {

	public static void main(String[] args) {
		
		try {
			Reader r = new FileReader("output1.txt");
			BufferedReader br = new BufferedReader(r);
			
			int d;
			while((d=br.read())!= -1) {
				System.out.print((char)d);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
