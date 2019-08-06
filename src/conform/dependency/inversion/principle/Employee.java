package conform.dependency.inversion.principle;

public class Employee {
	
	
	private String shift;
	
	public Employee(Shift shift) {
		this.shift = shift.getShiftName();
	}
	
	public void recess() {}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	};
}
