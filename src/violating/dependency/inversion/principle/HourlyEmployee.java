package violating.dependency.inversion.principle;

public class HourlyEmployee extends Employee{
	
	public HourlyEmployee(AfternoonShift afternoon) {
		super(afternoon);
	}
	
	public HourlyEmployee(EvenningShift evenning) {
		super(evenning);
	}
	
	public void clockIn() {};
	public void clockOut() {};
}
