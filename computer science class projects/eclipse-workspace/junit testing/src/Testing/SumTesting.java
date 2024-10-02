package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTesting {

	@Test
	void test() {
		MyClass test=new MyClass();
		int output=test.sum(10, 20);
		assertEquals(30,output);
	}

}
