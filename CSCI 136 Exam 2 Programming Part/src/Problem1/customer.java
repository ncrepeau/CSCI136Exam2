package Problem1;

import java.util.ArrayList;
import java.util.Scanner;

public class customer {
	private ArrayList<String> customer = new ArrayList<String>();

	public void addCustomer(ArrayList customer, String customerInfo) {
		customer.add(customerInfo);

	}

	public void removeCustomer(ArrayList customer, String customerToRemove) {
		customer.remove(customerToRemove);
	}

	public void upateCustomerOrder(ArrayList customer, String customerToRemove, String customerToUpdate) {
		customer.remove(customerToRemove);
		customer.add(customerToUpdate);
	}
}
