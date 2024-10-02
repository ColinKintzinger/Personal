package cs2assingment5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAssignfile {
AssignFile file=new AssignFile("file.txt");
	
		@Test
		void getFileNameTest() {
			String actual=file.getFileName();
			assertEquals("file.txt",actual);
		}
		@Test
		void setFileNameTest() {
			file.setFileName("colin");
			String actual=file.getFileName();
			assertEquals("colin",actual);
		}
	}


