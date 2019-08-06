package violating.liskov.substituion.principle;

public class Manager extends Employee{
	public void hire() {};
	public void dismiss() {};
	
	@Override
	public void clockIn() throws Exception {
		throw new Exception("Manager are not able to clockIn");
	}
	
	@Override
	public void clockOut() throws Exception {
		throw new Exception("Manager are not able to clockIn");
	}
	
}
