import java.util.Scanner;

public class StaticString {
	public static String reverseString(String sent) {
		char ch;
		String rev = "";
		for (int i = 0; i < sent.length(); i++) {
			ch = sent.charAt(i);
			rev = ch + rev;
		}
		return rev;
	}

	public static int countChar(String count, char letter) {
		int x = 0;
		for (int i = 0; i < count.length(); i++) {
			if (count.charAt(i) == letter)
				x++;

		}
		return x;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a phrase:");
		String sent = sc.nextLine();
		System.out.println("enter a letter you wanna look for:");
		char letter = sc.next().charAt(0);
		String stringsent =(sent);

		System.out.println("the phrase backwards is" + stringsent);

		int ch=countChar(sent, letter);
		System.out.println(ch);

	}// main end

}// class end
