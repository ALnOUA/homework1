package vehicles;

public class CCar extends CVehicle {

	public CCar(double price, double speed, int yearOfIssue) {
		super(price, speed, yearOfIssue);

	}

	@Override
	public String toString() {
		return "CCar Price=" + getPrice() + ", Speed=" + getSpeed() + ", YearOfIssue=" + getYearOfIssue();
	}

}
