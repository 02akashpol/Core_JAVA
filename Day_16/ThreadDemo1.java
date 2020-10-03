package multi_thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" (main) started");
		
		MyRunnable mth = new MyRunnable();
		
		Thread th = new Thread(mth);
		th.start();
		
		System.out.println(Thread.currentThread().getName()+" (main) finished");
		
	}

}

class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" (child) started");
		
		for(int i=0; i<5; i++) {
			
			try {
				
				Thread.sleep(300);
			} catch(InterruptedException exp) {
				
				
			}
			
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread().getName()+" (child) finished");
	}
}