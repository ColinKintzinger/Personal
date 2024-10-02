package cs2assignment8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testingPart1 {
	part1 prt=new part1();
	int[] number = {2,5,8,7,12};
	@Test
	void testLinearSearch() {

		assertEquals(true,part1.linearSearch(number,8));
	}
	@Test
	void testbinary() {
		assertEquals(true,part1.binarySearch(number, 8));
	}
	@Test
	void testbinaryRecursion() {
		int high=number.length;
		int low=0;
		assertEquals(true,part1.binarySearchRecursion(number, 8, low, high));
	}
}
