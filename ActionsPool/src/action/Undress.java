package action;

public class Undress extends Action {

	/**
	 * the constructor of the action undressing
	 * @param timeToEnd the duration of the action
	 */
	public Undress(int timeToEnd) {
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
		System.out.println("undressing (" + (totalTime-remainingTime+1) + "/" + totalTime +")");
		remainingTime--;
	}

}
