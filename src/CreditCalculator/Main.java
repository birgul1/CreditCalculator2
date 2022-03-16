package CreditCalculator;

import java.util.ArrayList;

import CreditCalculator.Credit.CarCredit;
import CreditCalculator.Credit.Credit;
import CreditCalculator.Credit.CreditManager;
import CreditCalculator.Credit.NeedCredit;
import CreditCalculator.Customer.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"Musa","BALIN","yazılım geliştirici");
		Customer customer1=new Customer(2,"Birgül","DADÜK","yazılım geliştirici");
		ArrayList<Credit> credits= new ArrayList<>();
		credits.add(new CarCredit());
		credits.add(new NeedCredit());
		
		
		
		
		CreditManager creditManager=new CreditManager(credits);
		creditManager.getCreditList(customer, 100000, 2);
		creditManager.getCreditList(customer1, 70000, 2);
	}

}

