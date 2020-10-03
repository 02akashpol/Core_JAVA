package io_op;

import java.io.*;

public class FileDemo1 {

	public static void main(String[] args)throws IOException {
		
		File f = new File("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo.txt");
		
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.createNewFile());
		System.out.println(f.length());
	}

}
