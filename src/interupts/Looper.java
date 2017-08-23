package interupts;

public class Looper implements Runnable {

	@Override
	public void run() {
		int i = 0;
		while(true){
			System.out.println(i);
			i++;
			if(Thread.interrupted()){
				return;
			}
		}
	}

}
