package conform.dependency.inversion.principle;

import java.util.ArrayList;
import java.util.List;

import conform._interface.segregation.principle.WaiTress;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * The employee class knows the abstract class Shift
		 * Shift implements multiples types
		 * 
		 * we are pointing to a abstraction and avoiding details
		 * 
		 * 
		 * that´s scalable because the only necessary job
		 * is to extends Shift class
		 * 
		 * if new Shift derivatives classes are needed
		 * the employee class does not need to recompile
		 * 
		 * we only need to add new classes
		 * 
		 * thats why we need to depend on interfaces fot this cases
		 * 
		 * */
		
		Employee chef = new Chef(new AfternoonShift());
		Employee secondChef = new Chef(new DawnShift());
		Employee manager = new Manager(new EvenningShift());
		
		
		List<Employee> allEmployess = new ArrayList<>();
		allEmployess.add(chef);
		allEmployess.add(secondChef);
		allEmployess.add(manager);
		
		allEmployess.forEach(consumer->System.out.println(consumer.getShift()));
		
		
		
	}

}
