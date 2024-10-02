
interface MyFInterface{
	String reverse(String mess);
}

class FInerface implements MyFInterface{
	public String reverse(String mess) {
		String result="";
		for(int i= mess.length()-1; i>=0;i--) {
			result +=mess.charAt(i);
			
		}
		return result;
		
	}
	
}
public class FunctionalInterfaceClass{
	public static void main(String[] args) {
		FInerface obj=new FInerface();
		
		System.out.println("string reversed ="+ obj.reverse("home"));
	}

	

}
