package multi_thread;

public class MultipleThreads {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" (main) started.");
		
		new Thread(new MyRunnable2()).start();
		new Thread(new MyRunnable2()).start();
		new Thread(new MyRunnable2()).start();
		
		System.out.println(Thread.currentThread().getName()+" (main) finished.");
	}

}

class MyRunnable2 implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" (child) started.");
		
		int sum = 0;
		
		for(int i=0; i<=10; i++) {
			
			sum+=i;
		}
		
		System.out.println("Sum : "+sum);
		
		System.out.println(Thread.currentThread().getName()+" (child) finished.");
 	}
}
