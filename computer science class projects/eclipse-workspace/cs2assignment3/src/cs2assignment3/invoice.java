package cs2assignment3;

import java.util.ArrayList;

public class invoice {
	private ArrayList<Lineitem> items = new ArrayList<>();
	private Adress billingAddress;

	public invoice(Adress billingAddress) {
		super();
		this.billingAddress = billingAddress;
	}

	public Adress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Adress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ArrayList<Lineitem> getItems() {
		return items;
	}

	public void setItems(ArrayList<Lineitem> items) {
		this.items = items;
	}

	public void addCharge(Product product, int quantity) {
		try {
			Lineitem item = new Lineitem(quantity, product);
//	System.out.println(item);
			items.add(item);
		} catch (Exception e) {
		}

	}

	public double totaldue() {

		double total = 0;
		for (int i = 0; i < items.size(); ++i) {
			total += items.get(i).totalPrice();
		}
		return total;
	}

	@Override
	public String toString() {
		String temp = billingAddress.toString() + "\n";
		for (int i = 0; i < items.size(); ++i) {
			temp += items.get(i).toString() + "\n";
			
		}

		return temp + totaldue() + "\n";
	}

}
