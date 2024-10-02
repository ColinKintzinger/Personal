package cs2assignment4;

public interface ShipAPI {
	boolean match(Location location); // returns true if this location matches
	// the ship's location
	boolean isSunk();// checks to see if the ship is sunk
	void sink(); // sets "sunk" member variable of the ship to true
	void setLocation(Location location); // deploys the ship at the specified 
	//location
	void printShip(); // prints location and status of the ship
}
