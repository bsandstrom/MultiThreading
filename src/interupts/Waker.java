package interupts;

public class Waker {

	public static void main(String[] args) throws InterruptedException {
		Sleeper sleeper = new Sleeper();
		Thread t = new Thread(sleeper);
		t.start();
		t.interrupt();
		t.join();
		System.out.println("Sleeping done");
		
		System.out.println("Running looper:");
		Looper looper = new Looper();
		Thread t2 = new Thread(looper);
		t2.start();
		Thread.sleep(500);
		t2.interrupt();
		t2.join();
		System.out.println("Loop stopped successfully");
	}

}
