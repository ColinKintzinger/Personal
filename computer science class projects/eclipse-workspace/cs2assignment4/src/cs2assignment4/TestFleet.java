package cs2assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFleet {

	@Test
	void testDeployFleet() {
		Fleet test=new Fleet();
		test.deployFleet();
	}
	@Test
	void testOperational() {
		Fleet test=new Fleet();
		assertTrue(test.operational());
		
	}
	@Test
	void testIsHitNSink() {
		Fleet test=new Fleet();
		Location loc=new Location(3,'a');
		Location loc1=new Location(3,'b');
	test.placeShipAtLocation(loc);
		assertTrue(test.isHitNSink(loc));
		assertFalse(test.isHitNSink(loc1));
	}
	@Test
	void testPrintFleet() {
		Fleet test=new Fleet();
		test.printFleet();
	}
	@Test
	void testcheck() {
		Fleet test=new Fleet();
		Location loc= new Location();
		test.check(loc);
	}
}
