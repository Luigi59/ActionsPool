package action;

public class Swim extends Action {

	/**
	 * the constructor of the action swimming
	 * @param timeToEnd the duration of the action
	 */
	public Swim(int timeToEnd) {
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
		System.out.println("swimming (" + (totalTime-remainingTime+1) + "/" + totalTime +")");
		remainingTime--;
	}

}