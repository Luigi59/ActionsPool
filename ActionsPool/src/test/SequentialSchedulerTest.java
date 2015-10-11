package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Scheduler;
import action.SequentialScheduler;

public class SequentialSchedulerTest extends SchedulerTest {

	protected Scheduler createScheduler() {
		return new SequentialScheduler(0);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
