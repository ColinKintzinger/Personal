import java.text.NumberFormat;
import java.util.Random;

public class StudentRecords {
	public static void fillarray(String[] stName, int[] stId, double[] stGpa) {
		Random rand = new Random();
		int i;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(1);
		for (i = 0; i < stName.length; i++) {
			stName[i] = "name" + (i + 1);
			stId[i] = 100 * (i + 1);
			stGpa[i] = Double.parseDouble(nf.format(rand.nextDouble() + rand.nextInt(4)));
		}
	}
public static void fillStudentsarray(student[] st) {
	Random rand = new Random();
	int i;
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(1);
	for (i = 0; i < st.length; i++) {
		// when use object make sure to use constructor 
		st[i]=new student();
		st[i].setStName("name" + (i + 1)); 
		st[i].setStID(100 * (i + 1));
		st[i].setStGPA(Double.parseDouble(nf.format(rand.nextDouble() + rand.nextInt(4))));
	}
}
public static void printstudentarray(student[] st) {

	int i;
	for (i = 0; i < st.length; i++) {
		System.out.println(st[i].getStName() + "\t" + st[i].getStID() + "\t" + st[i].getStGPA());
	}
	System.out.println("---------------------------------------------");

}

	public static void printarray(String[] stName, int[] stId, double[] stGpa) {

		int i;
		for (i = 0; i < stName.length; i++) {
			System.out.println(stName[i] + "\t" + stId[i] + "\t" + stGpa[i]);
		}
		System.out.println("---------------------------------------------");

	}

	public static void sortarray(String[] stName, int[] stId, double[] stGpa) {
		for (int i = 0; i < stName.length - 1; i++) {
			for (int j = i + 1; j < stName.length; j++) {
				if (stGpa[i] < stGpa[j]) {
					double temp = stGpa[i];
					stGpa[i] = stGpa[j];
					stGpa[j] = temp;
					
					int temp2 = stId[i];
					stId[i] = stId[j];
					stId[j] = temp2;
					
					String temp3 = stName[i];
					stName[i] = stName[j];
					stName[j] = temp3;
					
				}
				

			}
		}
	}
	public static void sortstudentarray(student[] st) {
		for (int i = 0; i < st.length - 1; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].getStGPA() < st[j].getStGPA()) {
					student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
					
					
				}
				

			}
		}
	}
	
	

	public static void main(String[] args) {
		String[] stName = new String[10];
		int[] stId = new int[10];
		double[] stGpa = new double[10];

		fillarray(stName, stId, stGpa);
		printarray(stName, stId, stGpa);
		sortarray(stName, stId, stGpa);
		printarray(stName, stId, stGpa);
		
		
		student[] st= new student[10];
		
		student obj1= new student();
		
		fillStudentsarray(st);
		printstudentarray(st);
		sortstudentarray(st);
		printstudentarray(st);
		

	}

}
