package cs2assignment3;

public class Lineitem {
	private int quantity;
	private Product product;

	public Lineitem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double totalPrice() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		return product.getDescription() + "   " + product.getPrice() + "  " + quantity + " totalPrice " + totalPrice();
	}

}
