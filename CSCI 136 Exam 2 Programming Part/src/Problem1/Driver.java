package Problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> customer = new ArrayList<String>();
		Scanner msc = new Scanner(System.in);
		customer myCustomer = new customer();
		File myFile = new File("./src/ComicInfo.txt");
		Scanner myFileScanner = new Scanner(myFile);
		while (myFileScanner.hasNextLine()) {
			String line = myFileScanner.nextLine();
			Scanner myLineScanner = new Scanner(line);
			while (myLineScanner.hasNextLine()) {
				String customerInfo = myLineScanner.nextLine();
				customer.add(customerInfo);
			}
		}
		System.out.println("Would you like to add any customers? Y/N");
		String addCustomer = msc.nextLine();
		while (addCustomer.equalsIgnoreCase("Y")) {
			System.out.println("Enter in the customers information please.");
			String customerInfo = msc.nextLine();
			myCustomer.addCustomer(customer, customerInfo);
			System.out.println("Would you like to add another customer? Y/N");
			addCustomer = msc.nextLine();
		}
		System.out.println("Would you like to delete a customer? Y/N");
		String deleteCustomer = msc.nextLine();
		while (deleteCustomer.equalsIgnoreCase("Y")) {
			System.out.println("Which customer would you like to delete?");
			String removeCustomer = msc.nextLine();
			myCustomer.removeCustomer(customer, removeCustomer);
			System.out.println("Would you like to delete a customer? Y/N");
			deleteCustomer = msc.nextLine();
		}
		System.out.println("Would you like to update a customer's order? Y/N");
		String updateCustomer = msc.nextLine();
		while (updateCustomer.equalsIgnoreCase("Y")) {
			System.out.println("Whose order would you like to update; Enter their name below");
			String customerToRemove = msc.nextLine();
			System.out.println("Please reenter in their information with the updated order information");
			String customerToUpdate = msc.nextLine();
			myCustomer.upateCustomerOrder(customer, customerToRemove, customerToUpdate);
			System.out.println("Would you like to update another customer's order? Y/N");
			updateCustomer = msc.nextLine();
		}
		for(int i = 0; i < customer.size(); i++) {
			System.out.println(customer.get(i));
		}
	}

}
