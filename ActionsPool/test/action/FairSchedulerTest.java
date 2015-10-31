package action;

import static org.junit.Assert.*;

import org.junit.Test;

import action.FairScheduler;
import action.Scheduler;

public class FairSchedulerTest extends SchedulerTest {
	
	protected Scheduler createScheduler() {
		FairScheduler s = new FairScheduler();
		s.addAction(new Dress(1));
		s.addAction(new Swim(2));
		return s;
	}

	@Test
	public void testIsReady() {
		assertTrue(super.a.isReady());
		super.a.doStep();
		assertFalse(super.a.isReady());
	}
	
	@Test
	public void testIsInProgress() {
		assertFalse(super.a.isInProgress());
		super.a.doStep();
		assertTrue(super.a.isInProgress());
	}

	@Test
	public void testIsFinished() {
		assertFalse(super.a.isFinished());
		super.a.doStep();
		super.a.doStep();
		super.a.doStep();
		assertTrue(super.a.isFinished());
		
		
		
	}
}
