package action;

public class Dress extends Action {

	/**
	 * the constructor of the action dressing
	 * @param timeToEnd the duration of the action
	 */
	public Dress(int timeToEnd) {
		super(timeToEnd);
		remainingTime = totalTime;
	}
	
	@Override
	public boolean isReady() {
		return remainingTime == totalTime;
	}

	@Override
	public boolean isInProgress() {
		return !isReady() && !isFinished();
	}
	
	@Override
	public boolean isFinished() {
		return remainingTime <= 0;
	}

	@Override
	public void doStep() {
		System.out.println("dressing (" + (totalTime-remainingTime+1) + "/" + totalTime +")");
		remainingTime--;
	}

}