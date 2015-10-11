package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.FairScheduler;
import action.Scheduler;

public class FairSchedulerTest extends SchedulerTest {

	protected Scheduler createScheduler() {
		return new FairScheduler(0);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
