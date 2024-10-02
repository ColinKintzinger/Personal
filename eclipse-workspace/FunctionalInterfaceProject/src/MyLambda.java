@FunGenLanbda
interface StringInterface{
	
	//abstract method
	String strMethod(String mess);
}
public class MyLambda {

	public static void main(String[] args) {
		StringInterface ref=(str) ->{
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result +=str.charAt(i);
			return result;
		};
		System.out.println("string reversed ="+ ref.strMethod("home"));
		
		StringInterface ref1=(str) ->{
			return str.substring(3);
		};
		//call the method of the interface
		System.out.println("sub string="+ ref1.strMethod("HP Laptop"));
		
		StringInterface ref2=(str) ->{
			String result="";
			for(int i=1;i<str.length();i+=2)
				result+=str.charAt(i);
				return result;	
		};
		System.out.println();
	}

}
