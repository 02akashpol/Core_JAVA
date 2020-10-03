package io_op;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class BufferIO {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fio = new FileInputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo.txt");
		
		FileChannel channel = fio.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(5);
		
		while(channel.read(buffer) > 0) {
			
			buffer.flip();
			
			for(int i=0; i<buffer.limit(); i++) {
				
				System.out.print((char)buffer.get());
			}
			buffer.clear();
		}
		
		fio.close();
	}

}
