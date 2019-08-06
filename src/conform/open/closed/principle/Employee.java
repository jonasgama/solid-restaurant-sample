package conform.open.closed.principle;

public class Employee {
	
	private String dayWeek;
	
	public void clockIn() {};
	public void clockOut() {};
	
	public String getRecess() {return dayWeek;};
	
	public void setRecess(String dayWeek) {
		this.dayWeek = dayWeek;
	};
}
