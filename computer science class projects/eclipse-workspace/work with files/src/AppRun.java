import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class AppRun {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		// allows the user to input data into the text file
	PrintStream wrtoFile = new PrintStream(new File("Mydata.txt"));
//		for (int i = 0; i < 3; ++i) {
//			System.out.println("enter emp name");
//			String empName = sc.nextLine();
//
//			System.out.println("enter emp salary");
//			double Salary = sc.nextDouble();
//
//			System.out.println("enter emp age");
//			int age = sc.nextInt();
//			sc.nextLine();
//			wrtoFile.println(empName);
//			wrtoFile.println(Salary);
//			wrtoFile.println(age);
//		}
		wrtoFile.close();

		Scanner Readfromfile = new Scanner(new File("Mydata.txt"));
		for (int i = 1; i <= 3; ++i) {
			String name = Readfromfile.nextLine();
			double salary = Readfromfile.nextDouble();
			int age = Readfromfile.nextInt();
			
			Readfromfile.nextLine();
			
			System.out.print(name + " " + salary + " " + age);
		}
		Readfromfile.close();

	}

}
