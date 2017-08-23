package interupts;

public class Sleeper implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000l);
		} catch (InterruptedException e) {
			System.out.println("The sleeper has awakened");
		}
	}

}
