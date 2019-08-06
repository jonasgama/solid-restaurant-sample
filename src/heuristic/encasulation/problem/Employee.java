package heuristic.encasulation.problem;

public class Employee {
	/*
	 * The exposition of the start field can be harming
	 * because if a consumer change its state will cause
	 * a misbehaviour where the first clock-in will fail
	 * since the start parameter is already true
	 * 
	 * */
	public boolean start;
	private boolean finish;

	@SuppressWarnings("unused")
	private void clockInStrategy(){
		if(start){
			finish = clockOut();
		}else{
			start = clockIn();
		}
	}
	
	private boolean clockOut() {
		return true;};
	
	private boolean clockIn() {
		return true;}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	};
}
