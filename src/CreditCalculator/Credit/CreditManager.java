package CreditCalculator.Credit;

import java.util.ArrayList;

import CreditCalculator.Customer.Customer;

public class CreditManager {

	private ArrayList<Credit> creditss;

	public CreditManager(ArrayList<Credit> creditss) {
		this.creditss = creditss;
	}

	public void getCreditList(Customer customer, double creditAmount, int year) {

		if (creditss.isEmpty()) {
			System.out.println("En az 1 Adet Kredi Seçmelisiniz.");
		} else {

			for (Credit credit : creditss) {
				System.out.println(customer.getFirstName() + " ");
				credit.calculate(creditAmount, year);
			}

		}
	}

}
