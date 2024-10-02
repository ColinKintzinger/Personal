
public class Anyloop {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; ++i) {
			for (int c = 1; c <= i; ++c) {
				System.out.print(c);

			}
			System.out.println();
		}
		for (int i = 1; i <= 5; ++i) {
			for (int c = 1; c <= 6 - i; ++c) {
				System.out.print(c);

			}
			System.out.println();
		}

		System.out.println();

		for (int i = 5; i >= 1; --i) {
			for (int c = 1; c <= i; ++c) {
				System.out.print(c);

			}
			System.out.println();
		}

	}

}
