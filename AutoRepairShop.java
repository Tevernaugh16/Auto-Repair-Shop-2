import javax.swing.JOptionPane;


public class DavisProgram4 
{

	//Tevernaugh Davis
	//CSCI 1301
	//Program 4
	//Auto Repair Shop
	
	
	public static void printcarMake(String carMake)
	{	
		JOptionPane.showMessageDialog(null, "HELLO! We will be happy to service your " + carMake + " automobile today!");
	}
	
	
	public static double carMaintenance(String carMake)
	{
	
		double totalCost = 0;
		String servicesNeeded = "";
		String answer = "no";
		String [] service = {"Oil Change", "Tire Rotation", "Air Filter", "Check Fluids"};
		double [] price = {39.99, 49.99, 19.99,10.99};
		
		do
			{
			int choice = Integer.parseInt(JOptionPane.showInputDialog(" What services would you like for your " + carMake 
			
					+ " ? \n1. Oil Change \n2. Tire Rotation \n3. Air Filter \n4. Check Fluids"));
			
			
			totalCost += price[choice -1];
			if(servicesNeeded.isEmpty())
				servicesNeeded += service[choice - 1];
			
			else servicesNeeded += ", " + service[choice - 1];
			
			JOptionPane.showMessageDialog(null, servicesNeeded + " will be " + totalCost);
			answer = JOptionPane.showInputDialog("Would you like to add any other services? ");
			
			}
			while(answer.equalsIgnoreCase("yes"));
			
			
			return totalCost;

}
	
	public static void finalPrice (double totalCost)
	{
		double totalPrice;
		String importCar;
		importCar = JOptionPane.showInputDialog(" Is your car an import? ");
		
		if(importCar.equalsIgnoreCase("yes"))
		{
			totalPrice = ((totalCost * .42) + totalCost);
			JOptionPane.showMessageDialog(null, "Today's services will cost a total of $" + totalPrice );
		}
		else
		{
			totalPrice = ((totalCost * .37) + totalCost);
			JOptionPane.showMessageDialog(null, "Today's services will cost a total of $" + totalPrice );
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
	
		String carMake = JOptionPane.showInputDialog("What is the make of your car? ");
		printcarMake(carMake);
		double totalCost = carMaintenance(carMake);
		finalPrice(totalCost);

		
	}

}
