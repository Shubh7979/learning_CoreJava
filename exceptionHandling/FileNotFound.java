package exceptionHandling;

import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader f = new FileReader("missing.txt");

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid file nane - file not found");
		}
	}

}
