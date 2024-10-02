package notes;

import java.util.Scanner;

public class october17th {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//loop statements 
		int count = 1;// initial value 
		while(count <= 1000000) { //loop statement
			System.out.println(count);
			count = count+1;// counter that serves the sentinel expression
			
		}
		
//loops always need an initializer a increment and a finalize
		
		//while loop
		int num = -1, max = 0;
		while (num != 0) {
			num = sc.nextInt();
			if (num > max) max=num;
		}
		System.out.print("them max value is" + num);
		
		//do while loop 
		do {
			System.out.print("Enter a positive intiger, 0 to exit.");
			num = sc.nextInt();
			if (num > max) max=num;
			
		}while (num != 0);
		System.out.print("Max is" + max);
		
		//for statement 
		for(int i=0; i<20; i++)
			System.out.println("i is:" +i);
				
	}//end main 

}//end of class 
