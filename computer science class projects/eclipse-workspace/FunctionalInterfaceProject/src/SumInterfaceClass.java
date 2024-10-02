@FunGenLanbda
interface SumInterface{
	
	double sum(double x,double y);
}
public class SumInterfaceClass {

	public static void main(String[] args) {
		SumInterface sum = (x,y) ->{return x+y;};
		double x= 2.5;
		double y= 1.5;
		System.out.println(x+ "+"+ y+"="+sum.sum(x, y));

	}

}
