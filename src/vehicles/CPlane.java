package vehicles;

public class CPlane extends CVehicle {
	private int flightAltitude;
	private int numberOfPassangers;

	public int getFlightAltitude() {
		return flightAltitude;
	}

	public int getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public void setFlightAltitude(int flightAltitude) {
		this.flightAltitude = flightAltitude;
	}

	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}

	public CPlane(double price, double speed, int yearOfIssue, int flightAltitude, int numberOfPassangers) {
		super(price, speed, yearOfIssue);
		this.flightAltitude = flightAltitude;
		this.numberOfPassangers = numberOfPassangers;
	}

	@Override
	public String toString() {
		return "CPlane flightAltitude=" + flightAltitude + ", numberOfPassangers=" + numberOfPassangers + ",Price="
				+ getPrice() + ", Speed=" + getSpeed() + ", YearOfIssue=" + getYearOfIssue();
	}

}
