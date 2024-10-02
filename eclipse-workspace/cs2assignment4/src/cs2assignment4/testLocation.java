package cs2assignment4;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class testLocation {

	@SuppressWarnings("unlikely-arg-type")
	@Test
	void test() {
		Location test=new Location();
		test.pick();
		assertTrue(test.getX()<=7 && test.getY()<='f');

	}
	@Test
	void test1() {
		Location test=new Location();
		test.fire();
	}
	@Test
	void test2() {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		assertEquals(7,a);
	}
	@Test
	void test3() {
	Location test=new Location();
	test.print();
	}
}
