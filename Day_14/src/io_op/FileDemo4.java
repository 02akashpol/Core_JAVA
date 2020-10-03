package io_op;

import java.io.*;

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo1.txt");
		
		int ch = -1;
		while((ch = f.read()) != -1) {
			
			System.out.print((char)ch);
		}
		f.close();
	}

}
