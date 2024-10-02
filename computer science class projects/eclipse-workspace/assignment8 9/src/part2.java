import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class part2 {
	public static void readTask(task[] arr) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("logfile.txt"));
		int i = 0;
		while (sc.hasNextLine()) {
			String desc = sc.nextLine();
			String time = sc.nextLine();
			String time2 = sc.nextLine();
			String date = sc.nextLine();
			int pri = sc.nextInt(); 
			sc.nextLine();
			arr[i] = new task(desc, time, time2, date , pri);
			++i;
			
//			arr[i].setDescription(sc.nextLine());
//			arr[i].setTime(sc.nextLine());
//			arr[i].setTime2(sc.nextLine());
//			arr[i].setDate(sc.nextLine()); 
//			arr[i].setPriority(sc.nextInt());
//			sc.nextLine();

			
			
			

		}
		sc.close();
	}

	public static void printTask(task[] arr) {
		for (int i = 0; i < 4; i++) {
			System.out.println("------------------------------------------");
			System.out.println("task:" + i + 1);
			System.out.println(arr[i].getDescription());
			System.out.println(arr[i].getTime());
			System.out.println(arr[i].getTime2());
			System.out.println(arr[i].getDate());
			System.out.println(arr[i].getPriority());

		}
	}

	public static void sortTask(task[] arr) {
		for (int i = 0; i < 4 - 1; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (arr[i].getPriority() > arr[j].getPriority()) {
					task temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
//	String[] taskdescription = new String[4];
//		String[] time = new String[4];
//		String[] time2 = new String[4];
//		String[] date = new String[4];
//		int[] priority = new int[4];
		task temp[] = new task[4];
		readTask(temp);
		Scanner sc1 = new Scanner(new File("passwords.txt"));
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the password: ");
		String password = sca.nextLine();
		boolean check = false;
		while (sc1.hasNext()) {
			if (sc1.nextLine().equals(password) == true) {
				readTask(temp);
				printTask(temp);
				sortTask(temp);
				printTask(temp);
				check = true;

			} else if (!check) {
				System.out.println("incorrect password");
			}
		}

	}

}
