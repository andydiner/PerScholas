package carWork;

public class CarInfo {

	private String name;
	private String mpg;
	private String cylinders;
	private String displacement;
	private String horsepower;
	private String weight;
	private String acceleration;
	private String model;
	private String origin;
	//private cat origin;
	public CarInfo(String name, String mpg, String cylinders, String displacement, String horsepower, String weight,
			String acceleration, String model) {
		this.name = name;
		this.mpg = mpg;
		this.cylinders = cylinders;
		this.displacement = displacement;
		this.horsepower = horsepower;
		this.weight = weight;
		this.acceleration = acceleration;
		this.model = model;
	}

	public CarInfo() {
		
	}
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMpg() {
		return mpg;
	}

	public void setMpg(String words) {
		this.mpg = words;
	}

	public String getCylinders() {
		return cylinders;
	}

	public void setCylinders(String words) {
		this.cylinders = words;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String words) {
		this.displacement = words;
	}

	public String getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(String words) {
		this.horsepower = words;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String words) {
		this.weight = words;
	}

	public String getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
	
	
	
	
	
	

}
