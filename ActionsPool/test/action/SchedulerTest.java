package action;

import action.Action;
import action.Scheduler;

public abstract class SchedulerTest extends ActionTest {
	
	protected abstract Scheduler createScheduler();

	protected Action createAction() {
		return createScheduler();
	}

}
