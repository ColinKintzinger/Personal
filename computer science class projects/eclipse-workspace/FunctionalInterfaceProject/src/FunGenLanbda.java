import java.util.ArrayList;

@FunctionalInterface
interface MyFunction<T, R>{
	R task(T t);
}
public class FunGenLanbda {

	public static void main(String[] args) {
		MyFunction<String, Integer> ref= (t) -> t.length();
		System.out.println(ref.task("my computer is HP"));
	
		MyFunction<Integer, Integer> ref1= (t) -> {
			return t*t;
		};
		System.out.println(ref1.task(5));
		
		ref1=(t)->{
			int fact=1;
			for(int i=1;i<=t;i++) 
				fact*=i;
				return fact;
		};
		System.out.println(ref1.task(7));
		MyFunction<Integer, Character> ref2= (t) -> {
			char ch=(char) t.intValue();
			return ch;
		};
		System.out.println(ref2.task(90));
		
		ArrayList<Double> list= new ArrayList<>();
		list.add(5.4);
		list.add(3.7);
		list.add(1.1);
		list.add(7.2);
		for(int i=1;i<list.size();++i) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		
		list.forEach((n)->System.out.println(n));
		System.out.println("------------------");
		list.forEach((l)->{
			if(l>5.0) System.out.println(l);
			
		});
		
		MyFunction<ArrayList<Double> , Double> ref3= (t) -> {
			double sum = 0.0;
			list.forEach((n)->{
				
				
			});
			return sum;
		};
		System.out.println(ref3.task(list));
		
		
		
		
	}
}
