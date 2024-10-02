package cs2assignment4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestShip {

	@Test
	void testgetloc() {
		Ship test=new Ship();
		Location loc=new Location(3,'b');
		test.setLocation(loc);
		
		assertTrue(test.getLocation().equals(loc));
	}
	@Test
	void testisSunk() {
		Ship test=new Ship();
		
		assertFalse(test.isSunk());
	}
	@Test
	void testsink() {
		Ship test=new Ship();
		test.sink();
		assertTrue(test.isSunk());
	}
	@Test
	void testmatch() {
		Ship test=new Ship();
		Location loc=new Location(3,'b');
		test.setLocation(loc);
		
		assertTrue(test.match(loc));
	}
	@Test
	void testprintShip() {
		Ship test=new Ship();
		test.printShip();
	}
	
	
}
