package io_op;

import java.io.*;

public class FileDemo2 {

	public static void main(String[] args) {
		
		File f = new File("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice");
		
		File files[] = f.listFiles(ff -> ff.isFile());
		
		for(File trav : files) {
			
			System.out.println(trav);
		}
	}

}
