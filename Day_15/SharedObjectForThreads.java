package multi_thread;

public class SharedObjectForThreads {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" (main) started.");
		
		SharedObjectClass obj = new SharedObjectClass();
		
		new Thread(new MyRunnable3(obj)).start();
		new Thread(new MyRunnable3(obj)).start();
		
		System.out.println(Thread.currentThread().getName()+" (main) finished.");
	}

}

class SharedObjectClass{
	
	void calculate() {
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			
			sum+=i;
		}
		System.out.println("Sum : "+sum);
	}
}

class MyRunnable3 implements Runnable{
	
	SharedObjectClass ref;
	
	MyRunnable3(SharedObjectClass ref) {
		
		this.ref = ref;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+" (child) started.");
		
		ref.calculate();
		
		System.out.println(Thread.currentThread().getName()+" (child) finished.");
	}
}
