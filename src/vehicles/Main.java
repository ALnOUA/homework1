package vehicles;

public class Main {

	public static void main(String[] args) {
		CVehicle BMW = new CCar(15000, 280, 2005);
		CVehicle Titanic = new CShip(250000, 210, 1905, 340, "London");
		CVehicle Boeing = new CPlane(300000, 420, 2008, 8000, 220);
		CVehicle AirBus = new CPlane(400000, 340, 2006, 9000, 280);
		CVehicle Toyota = new CCar(13000, 240, 2006);
		CVehicle array[] = new CVehicle[5];
		array[0] = BMW;
		array[1] = Titanic;
		array[2] = Boeing;
		array[3] = AirBus;
		array[4] = Toyota;
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}

	}

}
