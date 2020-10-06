package assignments;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CountOfT {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\CDAC_Data\\CDAC_Modules\\Core_JAVA\\Day_11\\Assignments\\src\\assignments\\Sample.txt");
		
		FileChannel channel = fis.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(10);
		
		int count = 0;
		int count1 = 0;
		
		while(channel.read(buffer) > 0) {
			
			buffer.flip();
			
			for(int i=0; i<buffer.limit(); i++) {
				
				if(buffer.get() =='t')
					count++;
				
				//System.out.print(buffer.get());
				count1++;
			}
			
			buffer.clear();
		}
		
		fis.close();
		channel.close();
		
		System.out.println("The number of times of 't' occurence in given file is : "+count);
		System.out.println("The number of times of total chars occurence in given file is : "+count1);
	}

}
