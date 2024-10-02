import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class part1 {
	public static void fillfile() throws FileNotFoundException {
		Random rand= new Random();
		PrintStream number = new PrintStream(new File("Numbers.txt"));
		for (int i = 0; i <= 20; ++i) {
			number.println(rand.nextInt(50)+1);
			}
	}
	public static void printfile() throws FileNotFoundException {
		Scanner sc= new Scanner(new File("Numbers.txt"));
		while(sc.hasNext()) {
			System.out.print(sc.nextInt()+" ");
		}
		sc.close();
	}
	public static void Averageodddata() throws FileNotFoundException {
		int count= 0;
		int sum=0;
		Scanner sc= new Scanner (new File("Numbers.txt"));
		while(sc.hasNext()) {
			int value = sc.nextInt();
			if (value % 2 == 1) {
			sum=value+sum;
			count++;
			}
		}
		sc.close();
		sum=sum/count;
		System.out.println("the avrage of the odd numbers:"+ sum);
	}
	
	public static void main(String[] args) throws FileNotFoundException {
			fillfile();
			Averageodddata();
			printfile();

			
		}
	}


