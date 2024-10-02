package cs2assignment4;

public class Ship implements ShipAPI{
	private Location loc;
	private boolean sunk;
	//a constructor to set sunk automatically to false
	
	
	
	public Ship(Location loc, boolean sunk) {
		super();
		this.loc = loc;
		this.sunk = sunk;
	}
	
	public Ship() {
		sunk=false;
		loc=new Location();
		
	}

	public Location getLocation() {
		return loc;
	}
	public boolean getSunk() {
		return sunk;
	}
	
	public void setSunk(boolean sunk) {
		this.sunk = sunk;
	}
	
;//sees if the location
	@Override
	public boolean match(Location location) {
		return this.loc.getX()==location.getX() && this.loc.getY()==location.getY();
	}
// checks to see if ship is sunk
	@Override
	public boolean isSunk() {
		
		return sunk;
	}
//sets sunk to equal to true
	@Override
	public void sink() {
		sunk=true;
		
	}
//sets the location of the ship 
	@Override
	public void setLocation(Location location) {
		this.loc=location;
	}

	@Override
	//allows users to print the locations of the ships and the status of the ship
	public void printShip() {
		loc.print();
		if(isSunk()) {
		System.out.print("sunk, ");
		}
		else {
			System.out.print("up, ");
		}
		
	}

	@Override
	public String toString() {
		printShip();
		return "" ;
	}

}
