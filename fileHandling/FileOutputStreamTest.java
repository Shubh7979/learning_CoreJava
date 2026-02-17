package fileHandling;

import java.io.FileOutputStream;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fs = new FileOutputStream("C:\\FileHandling_Learn\\test.txt");
			
			String s = "file Handling Programming";
			
			byte []b =s.getBytes();
			
			
		//	fs.write(65); //this add ASCII value
			fs.write(b);
			
			fs.close();
			
			System.out.println("File successfully handled");
			
		}catch (Exception e) {
			
			System.out.println(e);
		}
		

	}

}
