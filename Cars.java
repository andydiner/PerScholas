package carWork;

import java.io.IOException;

public class Cars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		CarInformation car = new CarInformation();
		
		String fname = "C:\\Users\\14802\\Desktop\\Per Scholas\\TestFiles\\cars.txt";
		car.readFile(fname);
	}

}
