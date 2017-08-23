package assembly;

public class Engine implements Component {
	
	private int buildTime = 7;

	@Override
	public int getBuildTime() {
		// TODO Auto-generated method stub
		return buildTime;
	}

	@Override
	public String toString() {
		return "Engine";
	}

	@Override
	public int compareTo(Component c) {
		return this.buildTime - c.getBuildTime();
	}
}
