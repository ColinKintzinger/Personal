import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		Random rand = new Random();

		File f = new File("intnumbers.txt");
		PrintStream wf = new PrintStream(f);
		int n = rand.nextInt(1000) + 1;
		for (int i = 1; i <= n; ++i) {

			wf.println(rand.nextInt(100) + 1);

		}
		wf.close();
		Scanner rf = new Scanner(new File("intnumbers.txt"));

		while (rf.hasNext()) {
			int value = rf.nextInt();
			System.out.print(value + " ");

		}
		rf.close();

		File fodd = new File("oddnumbers.txt");
		File feven = new File("evennumbers.txt");
		PrintStream wfodd = new PrintStream(fodd);
		PrintStream wfeven = new PrintStream(feven);

		while (rf.hasNext()) {
			int value = rf.nextInt();
			if (value % 2 != 0) {
				wfodd.println(value);
			} else {
				wfeven.println(value);
			}

		}
		rf.close();
	}

}
