package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		MyClass test=new MyClass();
		int output= test.fact(5);
		assertEquals(120,output);
	}

}
