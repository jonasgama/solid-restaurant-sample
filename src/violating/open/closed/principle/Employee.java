package violating.open.closed.principle;

public class Employee {
	//more fields will be required if new derivative classes are needed
	private String recessWaitress;
	private String recessManager;
	private String recessChef;
	private String recessCheckoutOperator;
	
	public void clockIn() {};
	public void clockOut() {};
	
	
	public void setRecessWaitress(String recessWaitress) {
		this.recessWaitress = recessWaitress;
	}
	public void setRecessManager(String recessManages) {
		this.recessManager = recessManages;
	}
	public void setRecessChef(String recessChef) {
		this.recessChef = recessChef;
	}
	public void setRecessCheckoutOperator(String recessCheckoutOperator) {
		this.recessCheckoutOperator = recessCheckoutOperator;
	}
	
	public String getRecessWaitress() {return recessWaitress;};
	public String getRecessManager() {return recessManager;};
	public String getRecessChef() {return recessChef;};
	public String getRecessCheckoutOperator() {return recessCheckoutOperator;}
}
