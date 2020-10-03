package io_op;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		File f = new File("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo");
		
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.mkdir());
		
	}

}
