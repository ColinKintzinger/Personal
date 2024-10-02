package cs2assignment1;

import java.util.Scanner;

public class part3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		asks the user to enter how many records they want to input in to the database and sets the size of the arrays
		System.out.println("how many car records do you wish to enter:");
		int recordsammount = sc.nextInt();
// these lines of code allow the computer to identify the four different array that will be used to sort the information 
		String[] customerName = new String[recordsammount];
		int[] accountNumber = new int[recordsammount];
		double[] savingsBal = new double[recordsammount];
		double[] debitBal = new double[recordsammount];
 
//fill arrays
		for (int i = 0; i < recordsammount; i++) {
			System.out.println("enter name");
			customerName[i] = sc.nextLine();
			sc.nextLine();
			System.out.println("enter account number");
			accountNumber[i] = sc.nextInt();
			System.out.println("enter debit balance");
			savingsBal[i] = sc.nextDouble();
			System.out.println("enter savings balance");
			debitBal[i] = sc.nextDouble();

		}
//		sort the arrays based on the amount of money in checking account
		for (int i = 0; i < recordsammount - 1; i++) {
			for (int j = i + 1; j < recordsammount; j++) {
				if (debitBal[i] > debitBal[j]) {
					double temp = debitBal[i];
					debitBal[i] = debitBal[j];
					debitBal[j] = temp;

					String temp2 = customerName[i];
					customerName[i] = customerName[j];
					customerName[j] = temp2;

					int temp3 = accountNumber[i];
					accountNumber[i] = accountNumber[j];
					accountNumber[j] = temp3;

					double temp6 = savingsBal[i];
					savingsBal[i] = savingsBal[j];
					savingsBal[j] = temp6;
				}

			}

		}
//		prints the arrays in the sorted order 
		for (int i = 0; i < recordsammount; i++) {
			System.out.println(customerName[i]);
			System.out.println(accountNumber[i]);
			System.out.println(debitBal[i]);
			System.out.println(savingsBal[i]);
		}
sc.close();
	}
	

}
