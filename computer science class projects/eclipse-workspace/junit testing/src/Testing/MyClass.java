package Testing;

public class MyClass {

	public int sum(int value1, int value2) {
		return value1+value2;
	}
	//factorial calculator
	public int fact(int value) {
		int fact=1;
			for(int i=1;i<=value;i++) {
				fact*=i;
			}
			return fact;
	}
	
}
