
public class Vehicle {
	
	private double price;
	private double length;
	private double weight;
	private String model;
	
	public Vehicle(){
		this(0,0,0,"U");
		
	}
	
	public Vehicle(double price,double length,double weight,String model)
	{
		setPrice(price);
		setLength(length);
		setWeight(weight);
		setModel(model);
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String toString()
	{
		String output = String.format("Model: %s\nPrice: %.2f\nLength: %f\nWeight: %f\n",model,price,length,weight);
		return output;
	}

}
