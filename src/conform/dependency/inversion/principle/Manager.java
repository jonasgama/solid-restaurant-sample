package conform.dependency.inversion.principle;

public class Manager extends Employee{
	
	public Manager(Shift shift) {
		super(shift);
	}
	public void hire() {};
	public void dismiss() {};
}
