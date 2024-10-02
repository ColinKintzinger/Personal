package handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.RowFilter.ComparisonType;

public class App {

	public static void main(String[] args) {
 ArrayList<Employee> list = new ArrayList<>();
		Employee emp1= new Employee(001,"colin",2500.25);
		Employee emp2= new Employee(002,"john",3984.49);
		Employee emp3= new Employee(003,"liam",19039.68);
		list.add(emp2);
		list.add(emp3);
		list.add(emp1);
		System.out.println(list);
		
		Collections.sort(list,Comparator.comparing(Employee::getSalary));
		
//		for(int i=0;i<list.size()-1;++i)
//		{
//			for(int j=i+1;j<list.size();++j) {
//				if(list.get(i).getSalary()>list.get(j).getSalary()) {
//					Employee empTemp=list.get(i);
//					empTemp=list.get(j);
//					list.set(j, list.get(i));
//					list.set(i, empTemp);
//					
//				}
//			}
//		}
		System.out.println(list);
		
	}

}
