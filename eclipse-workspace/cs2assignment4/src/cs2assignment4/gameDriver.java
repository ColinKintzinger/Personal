package cs2assignment4;

public class gameDriver {

	public static void main(String[] args) {
		//testing location class
Location location=new Location();
Fleet fleet=new Fleet();
//location.print();
//location.pick();
//location.print();
//location.fire();
//location.print();
//System.out.println("\n------ ending location test --------");
//
//		//ship testing
//Ship ship=new Ship();
//ship.printShip();
//
//ship.setLocation(location);
//
//ship.printShip();
//
//System.out.println(ship.isSunk());
////ship.sink();
////ship.printShip();
//
////test fleet class 
//System.out.println("------------");
fleet.deployFleet();


while(fleet.operational()) {
	fleet.printFleet();
	location.fire();
	fleet.check(location);
	fleet.isHitNSink(location);
	
	

}



	}
	

}
