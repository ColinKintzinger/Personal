package cs2assignment4;

public class Fleet implements FleetApi {
	private final int FleetSize = 7;// number of ships
	private Ship ship[] = new Ship[FleetSize];// ships of the fleet

//fills the array ship with objects of ship
	Fleet() {
		for (int i = 0; i < FleetSize; i++) {
			ship[i] = new Ship();
		}
	}

// deploys the random locations to the index in the array
	@Override
	public void deployFleet() {
		for (int i = 0; i < FleetSize; ++i) {

			Location location = new Location();
			int j;
			location.pick();

			for (j = 0; j < FleetSize; j++) {
				if (ship[i].match(location)) {
					--i;
					break;
				}
			}
//			location.print();
			ship[i].setLocation(location);

		}
	}

//checks to see if there are and ships that are 
	@Override
	public boolean operational() {
		for (int i = 0; i < FleetSize; ++i) {
			if (!ship[i].isSunk()) {
				return true;
			}
		}
		return false;
	}

//sees if the shot is a hit or a miss
	@Override
	public boolean isHitNSink(Location location) {
		for (int i = 0; i < FleetSize; ++i) {
			if (ship[i].match(location)) {
				System.out.println(i);
				ship[i].sink();
				return true;
			}
		}
		return false;
	}

//prints out the fleet
	@Override
	public void printFleet() {

		for (int i = 0; i < FleetSize; ++i) {

			ship[i].printShip();
		}

	}

//returns the index of the ship
	@Override
	public int check(Location location) {
		for (int i = 0; i < FleetSize; ++i) {
			if (location.equals(ship[i].getLocation())) {
				return i;
			}
		}
		return -1;
	}

	public void placeShipAtLocation(Location location) {
		ship[0].setLocation(location);
	}

}
