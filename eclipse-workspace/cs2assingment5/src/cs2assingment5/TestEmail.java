package cs2assingment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmail {
Email email= new Email("colin@gmail.com", "jake","weekend","yo yo what up fool what you doing this weekend");
	@Test
	void getSenderTest() {
		String actual=email.getSender();
		assertEquals("colin@gmail.com",actual);
	}
	@Test
	void setSenderTest() {
		email.setSender("colin");
		String actual=email.getSender();
		assertEquals("colin",actual);
	}
	@Test
	void getRecipientTest() {
		String actual=email.getRecipient();
		assertEquals("jake",actual);
	}
	@Test
	void setRecipientTest() {
		email.setRecipient("colin");
		String actual=email.getRecipient();
		assertEquals("colin",actual);
	}
	@Test
	void getTitleTest() {
		String actual=email.getTitle();
		assertEquals("weekend",actual);
	}
	@Test
	void setTitleTest() {
		email.setTitle("colin");
		String actual=email.getTitle();
		assertEquals("colin",actual);
	}
}
