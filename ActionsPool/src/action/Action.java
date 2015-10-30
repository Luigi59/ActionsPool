package action;

public abstract class Action {

	protected final int totalTime;
	protected int remainingTime;
	
	protected boolean isReady = true;
	protected boolean isInitialized = false;
	
	/**
	 * the constructor of an action
	 * @param timeToEnd the duration of the action
	 */
	public Action(int timeToEnd) {
		totalTime = timeToEnd;
	}
	
	/**
	 * tells if the action is ready
	 * @return true if the action is ready and false if not
	 */
	public abstract boolean isReady();
	
	/**
	 * tells if the action is in progress
	 * @return true if the action is in progress and false if not
	 */
	public abstract boolean isInProgress();
	
	/**
	 * tells if the action is finished
	 * @return true if the action is finished and false if not
	 */
	public abstract boolean isFinished();
	
	/**
	 * do a step of the action
	 */
	public abstract void doStep();
	
}
