package assembly;

import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunAssembly {
	public static void main(String[] args) throws InterruptedException{
		long startTime = System.currentTimeMillis();
		ComponentWarehouse warehouse = new ComponentWarehouse(1000);
		System.out.println(warehouse);
		System.out.println("Building " + warehouse.queue.size() + " components");
		
		ExecutorService executor = Executors.newFixedThreadPool(50);
		while(warehouse.queue.size()>0){
			executor.execute(new BuildComponentTask(warehouse));
		}
		executor.shutdown();
		executor.awaitTermination(1, TimeUnit.MINUTES);
		//Collections.sort(warehouse.components);
		System.out.println("final warehouse is " + warehouse);
		System.out.println("Warehouse contains " + warehouse.components.size() + " components");
		long totalTime = System.currentTimeMillis() - startTime;
		System.out.println("Total time spent was " + (totalTime/1000) + "." + (totalTime%1000) + " seconds");
	}
}
