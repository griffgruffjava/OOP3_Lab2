
public class Tank extends Vehicle{
	
	private boolean armoured;
	
	public Tank(){
		this(0,0,0,"U",false);
	}
	
	public Tank(double price,double length,double weight,String model,boolean armoured)
	{
		super(price,length,weight,model);
		setArmoured(armoured);
	}

	public boolean isArmoured() {
		return armoured;
	}

	public void setArmoured(boolean armoured) {
		this.armoured = armoured;
	}
	
	public String toString()
	{
		String output = super.toString();
		
		if(armoured)
		{
			output += "\nThis tank is armoured\n";
		}
		else
		{
			output += "\nThis tank is not armoured\n";
		}
		
		return output;
	}
	

}
