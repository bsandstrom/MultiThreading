package assembly;

public class Frame implements Component{
	private int buildTime = 5;
	@Override
	public int getBuildTime() {
		// TODO Auto-generated method stub
		return buildTime;
	}
	
	@Override
	public String toString(){
		return "Frame";
	}

	@Override
	public int compareTo(Component c) {
		return this.buildTime - c.getBuildTime();
	}
}
