package action;

import java.util.ArrayList;

public abstract class Scheduler extends Action {
	
	protected final ArrayList<Action> actions = new ArrayList<Action>();

	/**
	 * the constructor of a scheduler
	 */
	public Scheduler() {
		super(0);
	}
	
	@Override
	public boolean isReady() {
		return isInitialized && isReady;
	}

	@Override
	public boolean isInProgress() {
		return isInitialized && !isReady() && !isFinished();
	}
	
	@Override
	public boolean isFinished() {
		return isInitialized && !isReady() && actions.isEmpty();
	}

	@Override
	public abstract void doStep();
	
	/**
	 * add a action to the scheduler
	 * @param subAction the action to add
	 */
	public void addAction(Action subAction) {
		isInitialized = true;
		if(subAction.isFinished())
			throw new IllegalArgumentException("Can't add an already finished action");
		if(isFinished())
			throw new IllegalStateException("You can't add an action to a finished scheduler");
		else
			actions.add(subAction);
	}

}
