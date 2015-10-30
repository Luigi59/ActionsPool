package action;

import static org.junit.Assert.*;

import org.junit.Test;



import action.Action;
import action.Foreseeable;

public class ForeseeableTest extends ActionTest{

	protected Action createAction() {
		return new Foreseeable(2);
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
		super.a.doStep();
		assertFalse(super.a.isInProgress());
	}
	
	@Test
	public void testIsFinished() {
		assertFalse(super.a.isFinished());
		super.a.doStep();
		super.a.doStep();
		assertTrue(super.a.isFinished());
	}

}
