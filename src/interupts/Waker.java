package interupts;

public class Waker {

	public static void main(String[] args) throws InterruptedException {
		Sleeper sleeper = new Sleeper();
		Thread t = new Thread(sleeper);
		t.start();
		t.interrupt();
		t.join();
		System.out.println("Sleeping done");
	}

}
