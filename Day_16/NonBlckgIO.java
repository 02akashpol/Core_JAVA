package multi_thread;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class NonBlckgIO {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fio = new FileOutputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo.txt");
		
		FileChannel channel = fio.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(5);
		
		String str = "This is the new content added by the non-blocking input output stream.";
		
		for(int i=0; i<str.length(); ) {
			
			for(int j=0; j<buffer.limit() && i<str.length(); j++, i++) {
				
				buffer.put((byte)str.charAt(i));
			}
			buffer.flip();
			channel.write(buffer);
			buffer.clear();
		}
		System.out.println("write operation has been done successfully.");
		
		FileInputStream fio1 = new FileInputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_14\\Practice\\File_Demo\\demo.txt");
		
		FileChannel channel1 = fio1.getChannel();
		ByteBuffer buffer1 = ByteBuffer.allocate(5);
		
		while(channel1.read(buffer1) > 0) {
			
			buffer1.flip();
			for(int i=0; i<buffer.limit(); i++) {
				
				//System.out.println("Inside loop");
				
				System.out.print((char)buffer1.get());
			}
			buffer1.clear();
		}
			
		fio1.close();
		channel1.close();
		fio.close();
		channel.close();
	}

}
