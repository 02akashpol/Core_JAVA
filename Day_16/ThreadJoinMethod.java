package multi_thread;

public class ThreadJoinMethod {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" (main) started.");
		
		Thread th = new Thread(new MyRunnable1());
		th.start();
		
		try {

			th.join();
			
		} catch(InterruptedException exp) {
			
			
		}
		
		System.out.println(Thread.currentThread().getName()+" (main) finished.");
	}

}

class MyRunnable1 implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" (child) started.");
		
		for(int i=0; i<5; i++) {
			
			try {
				
				Thread.sleep(200);
			}catch(InterruptedException exp) {
				
				
			}
			
			System.out.println(i);
		}
		
		System.out.println(Thread.currentThread().getName()+" (child) finished.");
	}
}