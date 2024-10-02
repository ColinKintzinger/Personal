package october12thproject;

// this is a surface class which makes it easy to access and doesn't need a getter of setter
public class Myclass {
	static double sumxy(double x, double y) {
		/**
		 * double r = x+y; //return r; or are the two methods to get it to return
		 */

		return x + y;
	}

	static double subxy(double x, double y) {

		return x - y;

	}

	static double multxy(double x, double y) {

		return x * y;

	}

	static double divxy(double x, double y) {
		/**
		 * if( y==0) { System.out.println("can't devide by 0"); System.exit(0); return
		 * 0; } else
		 */
		return x / y;

	}

	static void printLine() {
		System.out.println("-----------------------");
	}

}
