package assembly;

public class Tire implements Component {
	private int buildTime = 2;
	@Override
	public int getBuildTime() {
		// TODO Auto-generated method stub
		return buildTime;
	}

	@Override
	public String toString(){
		return "Tire";
	}

	@Override
	public int compareTo(Component c) {
		return this.buildTime - c.getBuildTime();
	}
}
