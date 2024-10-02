package recursion;

public class RecDriver {
static void printCountDown(int p) {
	if(p==0)return;
	System.out.println(p);
	printCountDown(p-1);
	return;
}
static void printCountUp(int p) {
	if(p==0)return;
	printCountUp(p-1);
	System.out.println(p);
	return;
}
	public static void main(String[] args) {
		printCountDown(5);
		System.out.println("---------------------");
		printCountUp(5);

	}

}
