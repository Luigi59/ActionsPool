package action;

public class SequentialScheduler extends Scheduler {

	/**
	 * the constructor of a sequential scheduler
	 */
	public SequentialScheduler() {
		super();
	}

	@Override
	public void doStep() {
		isReady = false;
		Action nextAction = actions.get(0);
		nextAction.doStep();
		if(nextAction.isFinished())
			actions.remove(0);
	}
	
}
