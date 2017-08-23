package assembly;

public class BuildComponentTask implements Runnable {
	private Component component;
	private ComponentWarehouse warehouse;
	
	public BuildComponentTask(ComponentWarehouse warehouse){
		this.warehouse = warehouse;
		this.component = warehouse.getNext();
	}

	@Override
	public void run() {
		try {
			//System.out.println("Building " + component.toString());
			//Thread.sleep(component.getBuildTime());
			Thread.sleep(0l);
			//System.out.println(component.toString() + " is completed");
			warehouse.addComponent(component);
			//System.out.println(component + " has been added to the warehouse");
			
		} catch (InterruptedException e) {
			System.out.println("A component failed to build");
		}
	}

}
