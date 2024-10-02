import java.util.Scanner;

public class PersonalCars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many car records do you wish to enter:");
		int recordsammount = sc.nextInt();

		String[] brand = new String[recordsammount];
		String[] model = new String[recordsammount];
		int[] NumSeats = new int[recordsammount];
		boolean[] backupcam = new boolean[recordsammount];
		double[] carprice = new double[recordsammount];

//fill arrays
		for (int i = 0; i < recordsammount; i++) {
			System.out.println("enter brand");
			brand[i] = sc.nextLine();
			sc.nextLine();
			System.out.println("enter model");
			model[i] = sc.nextLine();
			System.out.println("enter how many seats");
			NumSeats[i] = sc.nextInt();
			System.out.println("enter does it have a backup camera");
			backupcam[i] = sc.nextBoolean();
			System.out.println("enter what is the price");
			carprice[i] = sc.nextDouble();

		}
		for (int i = 0; i < recordsammount - 1; i++) {
			for (int j = i + 1; j < recordsammount; j++) {
				if (carprice[i] > carprice[j]) {
					double temp = carprice[i];
					carprice[i] = carprice[j];
					carprice[j] = temp;

					String temp2 = brand[i];
					brand[i] = brand[j];
					brand[j] = temp2;

					String temp3 = brand[i];
					brand[i] = brand[j];
					brand[j] = temp3;

					String temp4 = model[i];
					model[i] = model[j];
					model[j] = temp4;

					int temp5 = NumSeats[i];
					NumSeats[i] = NumSeats[j];
					NumSeats[j] = temp5;

					boolean temp6 = backupcam[i];
					backupcam[i] = backupcam[j];
					backupcam[j] = temp6;
				}

			}

		}
		for (int i = 0; i < recordsammount; i++) {
			System.out.println(brand[i]);
			System.out.println(model[i]);
			System.out.println(NumSeats[i]);
			System.out.println(backupcam[i]);
			System.out.println(carprice[i]);
		}
	}

}
