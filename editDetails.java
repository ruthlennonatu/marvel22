import java.util.*;

public class editDetails {
	public static void main(String[] args) {
		int iD = 5; //Example
		String details = "Schedule on 30th of Dec, 0700.";
		
		Scanner keyIn = new Scanner (System.in);
	
		System.out.println("Enter the your #Order ID.");
		int orderID = keyIn.nextInt();
		
		if(orderID==iD)//if ID of the order is the same, ask what needed to change
		{
			System.out.println("Enter the details you would like to change.");
			String changeDetails = keyIn.nextLine();
			
			details = changeDetails;
			
			System.out.println("Order ID - " + iD + ". Request Description - " + details);
		}
		
		else
		{
			System.out.println("Cannot find your Order ID, please try again.");
		}
	}
}
