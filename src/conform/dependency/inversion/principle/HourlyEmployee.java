package conform.dependency.inversion.principle;

public class HourlyEmployee extends Employee{
	
	public HourlyEmployee(Shift shift) {
		super(shift);
	}
	
	public void clockIn() {};
	public void clockOut() {};
}
