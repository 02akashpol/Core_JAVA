package io_op;

import java.io.*;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f = new FileOutputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo1.txt");
		
		String str = "The content of demo1 file.";
		
		for(int i=0; i<str.length(); i++) {
			
			f.write(str.charAt(i));
		}
		
		f.close();
		
		System.out.println("Success.");
	}

}


