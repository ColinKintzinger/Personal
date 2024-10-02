package assignment10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class part2 {
	public static void createfile() throws FileNotFoundException {
		Random rand = new Random();
		PrintStream number = new PrintStream(new File("Numbers.txt"));
		for (int i = 0; i < 1000; ++i) {
			number.println(rand.nextInt(1000) + 1);
		}
		number.close();
	}

	public static void filllist(ArrayList<Integer> primelist) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("Numbers.txt"));
		while (sc.hasNextLine()) {
			primelist.add(sc.nextInt());
			sc.nextLine();
		}
		sc.close();

	}
	public static void primefill(ArrayList<Integer> primelist, ArrayList<Integer> primelist2) {
		for (int k=0;k<1000;++k) {
			int y;
			boolean check=true;
			for(y=2;y<=primelist.get(k)/2;y++) {
				if(primelist.get(k)%y==0) {
					check=false;
					break;
				}
			
			}
			if(check==true) {
				if(!primelist2.contains(primelist.get(k))) {
				primelist2.add(primelist.get(k));
				}
				
			}
		}
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> primelist = new ArrayList<>();
		ArrayList<Integer> primelist2 = new ArrayList<>();
		createfile();
		filllist(primelist);
		primefill(primelist, primelist2);
		System.out.println(primelist2);

	}

}
