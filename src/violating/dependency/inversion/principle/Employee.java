package violating.dependency.inversion.principle;

public class Employee {
	
	
	private String shift;
	
	public Employee(AfternoonShift afternoon) {
		shift = afternoon.shift();
	}
	
	public Employee(EvenningShift evenning) {
		shift = evenning.shift();
	}
	
	public void recess() {}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	};
}
