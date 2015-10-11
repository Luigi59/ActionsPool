package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;

public abstract class ActionTest {

	Action a = createAction();
	
	protected abstract Action createAction();
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
