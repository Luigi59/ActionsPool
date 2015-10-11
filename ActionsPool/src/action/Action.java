package action;

public  abstract class Action {

	protected final int totalTime;
	protected int remainingTime;
	
	protected boolean isReady = true;
	protected boolean isInitialized = false;
	
	public Action(int timeToEnd) {
		totalTime = timeToEnd;
	}
	
	public abstract boolean isReady();
	
	public abstract boolean isInProgress();
	
	public abstract boolean isFinished();
	
	public abstract void doStep();
	
}
