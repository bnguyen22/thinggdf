/**Ben Nguyen 
 * Meal Receipt
 */

import java.util.Scanner;

public class MealReceipt {

	public static void main(String[] args) 
	{
		Scanner beef = new Scanner(System.in);
		System.out.print("Tax and Tip Calculator");
		beef.nextLine();
		
		System.out.print("Please enter the name of your appetizer: ");
		String appetizer = beef.nextLine();
		System.out.print("Please enter the price of your appetizer: ");
		String appetizerpriceStr = beef.nextLine();
		double appetizerprice = Double.parseDouble(appetizerpriceStr);
		
		System.out.print("Please enter the name of your entree: ");
		String entree = beef.nextLine();
		System.out.print("Please enter the price of your entree: ");
		String entreepriceStr = beef.nextLine();
		double entreeprice = Double.parseDouble(entreepriceStr);
		
		System.out.print("Please enter the name of your dessert: ");
		String dessert = beef.nextLine();
		System.out.print("Please enter the price of your dessert: ");
		String dessertpriceStr = beef.nextLine();
		double dessertprice = Double.parseDouble(dessertpriceStr);
		System.out.print("Please enter the tax percentage");
		String taxStr = beef.nextLine();
		double tax = Double.parseDouble(taxStr);
		System.out.println("\n\n\nItem");
		System.out.println(appetizer + ": " + appetizerprice);
		System.out.println(entree + ": " + entreeprice);
		System.out.println(dessert + ": " + dessertprice);
		System.out.println(tax + 
		
		double totalprice = appetizerprice + entreeprice + dessertprice * 1.06;
		System.out.println("Your total price is $" + totalprice);

		
		
		
		
		
		
	}

}
