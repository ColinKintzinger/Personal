import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class passingfiles {

	public static void createIntFile(File f, int n) throws FileNotFoundException {
		Random rand = new Random();

		PrintStream wf = new PrintStream(f);

		for (int i = 1; i <= n; ++i) {

			wf.println(rand.nextInt(100) + 1);

		}
		wf.close();
	}
	
	public static void readfile(File f) throws FileNotFoundException {
		Scanner rf= new Scanner(f);
		int c=0;
		if(f.exists()==true) {
			while(rf.hasNext()) {
				int value=rf.nextInt();
				System.out.print(value+ " ");
				c++;
				if (c%10==0) System.out.println();
			}
			
			System.out.println();
		}else {
			System.out.println("there is no file");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		File f = new File("intData.txt");
		
		System.out.println("how many integer numbers need? :");
		int n=sc.nextInt();
		
		createIntFile(f,n);
		readfile(f);
	}

}
