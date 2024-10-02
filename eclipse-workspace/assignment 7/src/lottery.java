import java.util.Random;
import java.util.Scanner;

public class lottery {
	public static void initializer(int lottonumbers[]) {
		for (int i = 0; i < lottonumbers.length; i++) {
			lottonumbers[i] = 0;
		}
	}

	public static void generate(int[] lottonumbers) {

		Random random = new Random();
		for (int i = 0; i < lottonumbers.length;) {
			boolean found = false;
			int r = 0;
			found = false;
			r = random.nextInt(100);
			// Here we check if the number is not on the array yet
			if (!check(lottonumbers, r)) {
				lottonumbers[i] = r;
				i++;
			}
		}
	}

	public static boolean check(int[] lottonumbers, int number) {
		boolean check = true;
		for (int i = 0; i < lottonumbers.length; i++) {
			if (lottonumbers[i] == number) {
				return true;
			}
		}
		return false;
	}
	public static void printOut(int[] lottonumbers) {
		for (int i = 0; i < lottonumbers.length; i++) {
			System.out.print(lottonumbers[i]+ " ");
		}
		

	}
	public static int input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a vaule to see if it is in the lotto number:");
        int number = sc.nextInt();
		if(number>1 || number<100) {
			return number;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    int lottonumbers[] = new int[10];
        Random random = new Random();
        generate(lottonumbers);
        input();
        printOut(lottonumbers);
        
       
	
	/*while (i<arraylength){
	 x=rand.nextInt();
	 if(chec(x)==false){
	 arr[i]=x;
	 ++i
	 }
	 }
	 
	 */

	}
}
