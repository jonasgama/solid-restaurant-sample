package violating.dependency.inversion.principle;

public class Manager extends Employee{
	
	public Manager(EvenningShift evenning) {
		super(evenning);
	}
	public void hire() {};
	public void dismiss() {};
}
