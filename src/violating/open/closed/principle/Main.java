package violating.open.closed.principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> employess = new ArrayList<>();
		
		Employee checkouOperator = new CheckoutOperator();
		checkouOperator.setRecessCheckoutOperator("Monday");
		
		Employee chef = new Chef();
		chef.setRecessChef("Sunday");
		
		Employee manager = new Manager();
		manager.setRecessManager("Friday");
		
		Employee waiTress = new CheckoutOperator();
		waiTress.setRecessWaitress("Saturday");
		
		employess.add(checkouOperator);
		employess.add(chef);
		employess.add(manager);
		employess.add(waiTress);
		
		recessWeekScheduling(employess);
		
	}
	
	
	private static void recessWeekScheduling(List<Employee> employee){
		/*
		 * CHECKOUT_OPERATOR, CHEF, MANAGER, WAITRESS
		 * 
		 * You are violating the OCP cause
		 * Employee class is not open to new derivative classes 
		 * this has not well abstract implementation
		 * actually, we can´t do anything
		 * without modifying its behaviors
		 * that means, new types of employees will result in new
		 * methods for recess scheduling
		 * 
		 * the multiplication of cases inside this switch case 
		 * will be non-trivial.
		 * 
		 * if a want to access the field where the recess day is stored
		 * i have to know the right method.
		 * */
		for (Employee emp : employee) {
			switch (emp.getClass().getSimpleName()) {
			case "WaiTress":
				System.out.println(emp.getRecessWaitress() + "/" + emp.getClass().getSimpleName());
				break;
			case "Manager":
				System.out.println(emp.getRecessManager() + "/" + emp.getClass().getSimpleName());
				break;
			case "Chef":
				System.out.println(emp.getRecessChef() + "/" + emp.getClass().getSimpleName());
				break;
			case "CheckoutOperator":
				System.out.println(emp.getRecessCheckoutOperator() + "/" + emp.getClass().getSimpleName());
				break;
			default:
			}
			
		}
	}

}
