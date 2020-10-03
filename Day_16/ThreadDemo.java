package multi_thread;

public class ThreadDemo {

	public static void main(String[] args) {
		
		MyThread th = new MyThread();     // new state
		th.start();                       // runnable state
	}

}

class MyThread extends Thread{                    
	
	@Override
	public void run() {                   // running state
		
		for(int i=0; i<5; i++) {
			
			System.out.println(i);
		}
	}                                     // dead state     
}