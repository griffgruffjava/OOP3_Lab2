import javax.swing.JOptionPane;

 
public class VehicleDriver {
	
	
	
	public static void main(String args[])
	{
		final int FLEETSIZE = 3;
		
		String choice, output="", output2="";
		
		Vehicle v;
		
		Vehicle[] fleet = new Vehicle[FLEETSIZE];
		
		for(int i=0;i<fleet.length;i++)
		{
			choice = JOptionPane.showInputDialog("Would you like to make a car or tank?");
			
			if(choice.charAt(0)=='c' || choice.charAt(0)=='C')
				{
					double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the car?"));
					double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length of the car?"));
					double weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight of the car?"));
					String model = JOptionPane.showInputDialog("What is the model of the car");
					int maxPassengers = Integer.parseInt(JOptionPane.showInputDialog("What is the max amount of passengers this car holds?"));
					String reg = JOptionPane.showInputDialog("What is the car registration number?");
					
					v = new Car(price,length,weight,model,maxPassengers,reg);
				}
			else
				{
					double price = Double.parseDouble(JOptionPane.showInputDialog("What is the price of the tank?"));
					double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length of the tank?"));
					double weight = Double.parseDouble(JOptionPane.showInputDialog("What is the weight of the tank?"));
					String model = JOptionPane.showInputDialog("What is the model of the tank");
					String armourString = JOptionPane.showInputDialog("Is this tank armoured (y or n)?");
					if(armourString.charAt(0)=='y')
					{
						v = new Tank(price,length,weight,model,true);
					}
					else
					{
						v = new Tank(price,length,weight,model,false);
					}
					
				}
			
			fleet[i] = v;
			
			output += v.toString()+"\n";
			
			output2 += v.getClass()+"\n";
			
		}
		
		JOptionPane.showMessageDialog(null,output, "Vehicle Report",JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null,output2, "Vehicle Class Report",JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
