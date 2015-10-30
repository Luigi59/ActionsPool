package action;

public class FairScheduler extends Scheduler {

	/**
	 * the constructor of a fair scheduler
	 */
	public FairScheduler() {
		super();
	}
	
	@Override
	public void doStep() {
		isReady = false;
		Action nextAction = actions.get(0);
		nextAction.doStep();
		if(nextAction.isFinished())
			actions.remove(0);
		else
			actions.add(actions.remove(0));
	}

}
