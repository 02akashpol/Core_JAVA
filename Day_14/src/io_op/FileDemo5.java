package io_op;

import java.io.*;

public class FileDemo5 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f = new FileOutputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo2.txt");
		
		DataOutputStream d = new DataOutputStream(f);
		
		d.writeInt(12);
		d.writeUTF("Akash Pol");
		d.writeDouble(12.345);
		
		d.close();
		f.close();
		
		System.out.println("Success.");
	}

}
