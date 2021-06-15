package carWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CarInformation {
	
	public void displayCarInfo(ArrayList<CarInfo> carInfo) {
		
		ArrayList<CarInfo> myInfo = carInfo;
		for(CarInfo car: myInfo) {
			System.out.println(car.getName() + " " 
							+ car.getMpg() + " "
							+ car.getCylinders() + " "
							+ car.getDisplacement() + " "
							+ car.getHorsepower() + " " 
							+ car.getWeight() + " "
							+ car.getAcceleration() + " "
							 + car.getModel() + " "
							 + car.getOrigin());
		}
	}
	
	public void readFile(String fname) throws IOException {
		
		String fName = fname;
		BufferedReader bufRead = new BufferedReader(new FileReader(fName));
		ArrayList<CarInfo> carInfo = new ArrayList<CarInfo>();
		String line;
		String[] words;
		int i = 0;
		while((line = bufRead.readLine()) != null) {
			CarInfo car = new CarInfo();
			words = line.split(",");
				car.setName(words[i++]);
				car.setMpg(words[i++]);
				car.setCylinders(words[i++]);
				car.setDisplacement(words[i++]);
				car.setHorsepower(words[i++]);
				car.setWeight(words[i++]);
				car.setAcceleration(words[i++]);
				car.setModel(words[i++]);
				car.setOrigin(words[i++]);
				carInfo.add(car);
			i = 0;
		}
		displayCarInfo(carInfo);
		bufRead.close();
	}
}