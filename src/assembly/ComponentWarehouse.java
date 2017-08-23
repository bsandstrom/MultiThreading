package assembly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComponentWarehouse {
	List<Component> queue = Collections.synchronizedList(new ArrayList<Component>());
	List<Component> components = Collections.synchronizedList(new ArrayList<Component>());
	
	public Component getNext(){
		return this.queue.remove(queue.size()-1);
	}
	
	public void addComponent(Component component){
		components.add(component);
	}
	
	public ComponentWarehouse(int cars){
		for(int i = 0; i < cars; i++){
			//add 4 tires
			for(int a = 0; a < 4; a++){
				queue.add(new Tire());
			}
			//add 5 seats
			for(int a = 0; a < 5; a++){
				queue.add(new Seat());
			}
			//add an engine
			queue.add(new Engine());
			//add a frame
			queue.add(new Frame());
		}
		Collections.sort(queue);
	}

	@Override
	public String toString() {
		return "ComponentWarehouse [queue=" + queue + ", components=" + components + "]";
	}
	

}
