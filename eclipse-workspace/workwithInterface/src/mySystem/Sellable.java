package mySystem;

public interface Sellable {
/** Returns a description of the object*/
	public String description();
/**returns list of price in cents*/
	public double listPrice();
/**returns the lowest price in cents */
	public double lowestPrice();

}
