package assembly;

public class Seat implements Component {
	private int buildTime = 3;

	@Override
	public int getBuildTime() {
		// TODO Auto-generated method stub
		return buildTime;
	}

	@Override
	public String toString(){
		return "Seat";
	}

	@Override
	public int compareTo(Component c) {
		return this.buildTime - c.getBuildTime();
	}
}
