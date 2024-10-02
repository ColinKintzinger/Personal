package cs2assignment3;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		// these allow us to create and object using the product class 
		Product p = new Product("Toaster", 29.95);
		Product p1=new Product("Hair Dryer",24.95);
		//this creates the object from the class of address
		Adress adress = new Adress("colin", "cole street", "sparta", "wisconsin", "54656");

		invoice Inv = new invoice(adress);
		
		Inv.addCharge(p, 3);
		Inv.addCharge(p1, 6);
		System.out.println(Inv);


	}

}
