import java.util.*;

public class getOrderStatus {
	static int iD = 1; //Example
	static String details = "Status - Delivered.";
	
	public static void main(String[] args) {
	Scanner keyIn = new Scanner (System.in);

	System.out.println("Enter the your #Order ID.");
	int orderID = keyIn.nextInt();
	
		if(orderID==iD)//if ID of the order is the same, return details
		{
			System.out.println(details);
		}
		
		else
		{
			System.out.println("Cannot find your Order ID, please try again.");
		}
	}
		
		
	public String getDetails() 
	{
		return details;
	}
}