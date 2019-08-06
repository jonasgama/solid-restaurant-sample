package violating.dependency.inversion.principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * The employee class has double composition dependency
		 * with afternoon and evening shifts
		 * 
		 * we are pointing to implementation details
		 * and not abstract classes
		 * 
		 * that´s not scalable because if the quantity
		 * of shifts increase, so the constructors
		 * 
		 * thats why we need to depend on interfaces fot this cases
		 * 
		 * */
		
		Employee chef = new Chef(new AfternoonShift());
		Employee manager = new Manager(new EvenningShift());
		
		List<Employee> allEmployess = new ArrayList<>();
		allEmployess.add(chef);
		allEmployess.add(manager);
		
		allEmployess.forEach(consumer->System.out.println(consumer.getShift()));
		
		
		
	}

}
