package sec04;

public class Travel {

	private int oil;
	private String location;

	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	void minusOil(int oil) {
		this.oil -= oil;
	}

	boolean isOil() {
		if (oil > 0) {
			return true;
		} else {
			return false;
		}
	}

}
