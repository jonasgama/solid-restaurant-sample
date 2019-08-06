package violating.dependency.inversion.principle;

public class Chef extends HourlyEmployee{
	
	public Chef(AfternoonShift afternoon) {
		super(afternoon);
	}

	public void cook() {};
}
