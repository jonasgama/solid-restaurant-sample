package conform._interface.segregation.principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * In this case
		 * we have full support by Employee/HourlyEmployee class
		 * the difference between them,
		 * is the clock-in/clock-out policy methods
		 * 
		 * when we make reference of Employee in a loop way
		 * we can identify child classes and control behaviors
		 * 
		 * 
		 * this examples is conforming with ISP
		 * we have recess problem already solved
		 * and a fine solution for clock-in policies
		 * our entities are divided in groups where
		 * some has clock-in procedures and others not.
		 * 
		 * */
		
		List<Employee> allEmployees = new ArrayList<>();
		HourlyEmployee chef = new Chef();
		HourlyEmployee waitress = new WaiTress();
		Employee manager = new Manager();
		Employee executive = new Executive();
		
		allEmployees.add(chef);
		allEmployees.add(waitress);
		allEmployees.add(manager);
		allEmployees.add(executive);
		
		allEmployees.forEach(consumer->{
			
			if(consumer.getClass().getSuperclass().getSimpleName().equals("HourlyEmployee")) {
				System.out.println(consumer.getClass().getSimpleName() + " are able for the Hourly Employee policy");
			}else {
				System.out.println(consumer.getClass().getSimpleName() + " is a position based on trust");
			}
				
		});
		
	}

}
