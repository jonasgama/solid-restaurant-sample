package conform.open.closed.principle;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Employee> employess = new ArrayList<>();
		
		Employee checkouOperator = new CheckoutOperator();
		checkouOperator.setRecess("Monday");
		
		Employee chef = new Chef();
		chef.setRecess("Sunday");
		
		Employee manager = new Manager();
		manager.setRecess("Friday");
		
		Employee waiTress = new CheckoutOperator();
		waiTress.setRecess("Saturday");
		
		employess.add(checkouOperator);
		employess.add(chef);
		employess.add(manager);
		employess.add(waiTress);
		
		recessScheduling(employess);
		
		
	}
	
	
	private static void recessScheduling(List<Employee> employee) {
		/*
		 * 
		 * 
		 * You are conformed with the OCP cause
		 * Employee class is open to new derivative classes 
		 * without modifying its behaviours
		 * that means, new types of employees will fit in the
		 * core behaviour without modifying it
		 * 
		 * easily to expand, less code
		 * 
		 * 
		 * */
		for (Employee emp : employee) {
			System.out.println(emp.getRecess() + "/" + emp.getClass().getSimpleName());
		}
	}

}
