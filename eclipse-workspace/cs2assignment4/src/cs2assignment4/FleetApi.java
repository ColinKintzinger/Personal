package cs2assignment4;

public interface FleetApi {
	  void deployFleet(); // deploys the ships in random locations
      // of the ocean
boolean operational(); // predicate returns true if at least
        // one ship in the fleet is not sunk
boolean isHitNSink(Location location); // returns true if there was a deployed
    // ship at this location (hit) and sinks it
    // otherwise returns false (miss)
void printFleet(); // prints out locations of ships in fleet
int check(Location location); // returns index of the ship 
}
