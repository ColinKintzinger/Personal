package handson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class WorkWithFiles003_driverApp {

	public static void main(String[] args) throws FileNotFoundException {
		Random rand= new Random();
		File file=new File("MyFile.txt");
		PrintStream wf= new PrintStream(file);
		if(!file.exists()) {
		for (int i=0;i<11;++i) {
		wf.println(rand.nextInt(100)+1);
		}
		}
		else {
			System.out.println("file doesn't exist");
		}
		wf.close();
		
	}

}
