package violating._interface.segregation.principle;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * First of all
		 * we cannot use the Employee class
		 * cause we made the implementation of 
		 * clock-in / clock-out inside chef and waitress class
		 * 
		 * when we make reference of Employee in a loop way
		 * we lose those methods 
		 * 
		 * so we are not using abstract class, we are tooking
		 * the implementation classes instead
		 * 
		 * this can be really harming.
		 * 
		 * this examples is not conforming with ISP
		 * we have recess problem already solved
		 * but lacks a solution for clock-in policies
		 * our entities are divided in groups where
		 * some has clock-in procedures and others not.
		 * 
		 * */
		
		
		Chef chef = new Chef();
		WaiTress waitress = new WaiTress();
		
		chef.clockIn();
		System.out.println(chef.getClass().getSimpleName() + "just clocked-in");
		
		waitress.clockIn();
		System.out.println(waitress.getClass().getSimpleName() + "just clocked-in");
		
	}

}
