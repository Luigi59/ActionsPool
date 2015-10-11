package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;
import action.Scheduler;

public abstract class SchedulerTest extends ActionTest {
	
	protected abstract Scheduler createScheduler();

	protected Action createAction() {
		return createScheduler();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
