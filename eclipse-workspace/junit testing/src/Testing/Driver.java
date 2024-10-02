package Testing;

public class Driver {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		int res=obj.sum(5, 7);
		if(res==12) System.out.println("pass");else System.out.println("fail");
	}

}
