package fileHandling;

import java.io.FileInputStream;

public class ReadDataFromFile {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fs = new FileInputStream("C:\\FileHandling_Learn\\test.txt");
			
			String s = "file Handling Programming";
			
			byte []b =s.getBytes();
			
			
			int i;
			while((i= fs.read()) != -1 ) {
				
				System.out.print((char)i);
			}
			
			fs.close();
						
		}catch (Exception e) {
			
			System.out.println(e);
		}
		

	}

}
