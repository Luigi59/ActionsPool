package action;

public class Foreseeable extends Action {

	/**
	 * the constructor of a foreseeable action
	 * @param timeToEnd the duration of the action
	 */
	public Foreseeable(int timeToEnd) {
		super(timeToEnd);
		super.remainingTime = timeToEnd;
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
		remainingTime--;
	}

}
