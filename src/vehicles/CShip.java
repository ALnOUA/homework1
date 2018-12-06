package vehicles;

public class CShip extends CVehicle {
	private int numberOfPassengers;
	private String homePort;

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public String getHomePort() {
		return homePort;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}

	public CShip(double price, double speed, int yearOfIssue, int numberOfPassengers, String homePort) {
		super(price, speed, yearOfIssue);
		this.numberOfPassengers = numberOfPassengers;
		this.homePort = homePort;
	}

	@Override
	public String toString() {
		return "CShip numberOfPassengers=" + numberOfPassengers + ", homePort=" + homePort + ", Price=" + getPrice()
				+ ", Speed=" + getSpeed() + ", YearOfIssue=" + getYearOfIssue();
	}

}
