package mySystem;

public class Photograph implements Sellable {
	private String descript;//description of photo
	private double price;//price of photo
	private boolean color;//if photo is in color or black and white
	private double discountPercentage;//the discount on the photo
	public Photograph(String descript, double price, boolean color, double discountPercentage) {
		super();
		this.descript = descript;
		this.price = price;
		this.color = color;
		this.discountPercentage = discountPercentage;
	}
	@Override
	public String description() {
		
		return descript;
	}
	@Override
	public double listPrice() {
		
		return price;
	}
	@Override
	public double lowestPrice() {
		
		return price-(price*(discountPercentage/100));
	}
	public boolean isColor() {
		return color;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public String toString() {
		String isColor="Discolored";
		if(color) isColor="color";
		return descript+ ",$"+ price+ ","+ isColor +" Discount"+ discountPercentage+ " total="+ lowestPrice();
	}
}
