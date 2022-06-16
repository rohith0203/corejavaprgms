package files;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filewriter {
public static void main(String[] args) {
	
	
	
	try {
		String a="hi",b="byeeeeeeeeeee";
		String c=a+b;
		FileWriter f1=new FileWriter("D:\\def.txt");
		f1.write("hiiiiii");
		f1.write('A');
		f1.write("b");
		System.out.println("file created sucessfully");
		
		f1.write(c);
	f1.write(65);	f1.flush();
		f1.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	
//	 FileWriter fw;
//	try {
//		 FileWriter fw = new FileWriter("D:\\xyz.txt");
//		BufferedWriter b1=new BufferedWriter(fw);
//		b1.write("hoola");
//		b1.newLine();
//		b1.write("amigoo");
//		System.out.println("over");
//		b1.flush();
//		b1.close();
//		
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	
	try {
		PrintWriter p=new PrintWriter("D:\\pqr.txt");
		p.println("acha");
		p.println("ok");
		p.flush();
		p.close();
		System.out.println("file created for print writer");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	
//	
	
	
	
	
	
	
	
}
}
