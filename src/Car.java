
public class Car extends Vehicle{
	
	private int maxPassengers;
	private String registrationNumber;
	
	public Car(){
		this(0,0,0,"U",0,"NOplate");
	}
	
	public Car(double price,double length,double weight,String model,int maxPassengers,String registrationNumber){
		super(price,length,weight,model);
		setMaxPassengers(maxPassengers);
		setRegistrationNumber(registrationNumber);
	}
	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public String toString()
	{
		String output = super.toString();
		output += "Max Passengers Allowed : " + maxPassengers +"\nRegistration: " + registrationNumber;
		return output; 
	}

}
