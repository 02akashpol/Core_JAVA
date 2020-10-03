package io_op;

import java.io.*;

public class FileDemo6 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo2.txt");
		
		DataInputStream d = new DataInputStream(f);
		
		int i = d.readInt();
		String name = d.readUTF();
		double d1 = d.readDouble();
		
		System.out.println(i+" "+name+" "+d1);
	}

}
