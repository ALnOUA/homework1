package vehicles;

public abstract class CVehicle {
	private double price;
	private double speed;
	private int yearOfIssue;

	public double getPrice() {
		return price;
	}

	public double getSpeed() {
		return speed;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}

	public CVehicle(double price, double speed, int yearOfIssue) {
		super();
		this.price = price;
		this.speed = speed;
		this.yearOfIssue = yearOfIssue;
	}

	@Override
	public String toString() {
		return "CVehicle price=" + price + ", speed=" + speed + ", yearOfIssue=" + yearOfIssue + ", toString()="
				+ super.toString() + "]";
	}

}
