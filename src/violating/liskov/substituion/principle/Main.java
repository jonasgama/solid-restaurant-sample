package violating.liskov.substituion.principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	/*
	 * We designed the behavior of clock-in previously  
	 * But some changes arrived, and problem emerged
	 * We did not noticed all managers are trusted positions
	 * and do not clock-in or clock-out
	 * 
	 * How can we solve this, since all managers has a IS-A
	 * relationship with Employer super class but don´t has the same
	 * behavior at all?
	 * 
	 * We are violating LSP cause the superclass
	 * are causing a misbehavior in the derivative classes
	 * even when we have a IS-A relationship logic
	 * 
	 * We also violated OCP because the core functions
	 * are not really closed to modifications,
	 * new requirements are demanding changes.
	 * 
	 * */
	public static void main(String[] args) {
		Employee chef = new Chef();
		Employee manager = new Manager();
		
		List<Employee> employess = new ArrayList<>();
		employess.add(chef);
		employess.add(manager);
		
		employess.forEach(e->{
			try {
				e.clockIn();
				System.out.println(e.getClass().getSimpleName() + "Just Clock-in");
			} catch (Exception e1) {
				System.out.println(e1.getMessage());;
			}
		});
		
		
		
	}

}
