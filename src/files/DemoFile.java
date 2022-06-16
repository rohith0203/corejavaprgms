package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFile {
	public static void main(String[] args) {
		File f= new File("D:\\File.txt");
		try {
			if(f.createNewFile())
			{
				System.out.println("file is created");
			}
			else
			{
				System.out.println("file is not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void Writer(String string) {
		// TODO Auto-generated method stub
		
	}

}
