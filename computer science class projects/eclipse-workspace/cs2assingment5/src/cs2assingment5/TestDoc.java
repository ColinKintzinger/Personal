package cs2assingment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDoc {
	Document doc=new Document("hello there");
	
	@Test
	void getTextTest() {
	String actual=doc.getText();
	assertEquals("hello there",actual);

	}

	@Test
	void setTextTest() {
		doc.setText("I am");
	String actual=doc.getText();
	assertEquals("I am",actual);

	}

}
