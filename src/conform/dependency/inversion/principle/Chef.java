package conform.dependency.inversion.principle;

public class Chef extends HourlyEmployee{
	
	public Chef(Shift shift) {
		super(shift);
	}

	public void cook() {};
}
