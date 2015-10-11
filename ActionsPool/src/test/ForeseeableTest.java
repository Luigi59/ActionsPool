package test;

import static org.junit.Assert.*;

import org.junit.Test;

import action.Action;
import action.ResourceAction;

public class ForeseeableTest extends ActionTest{

	protected Action createAction() {
		return new ResourceAction(1);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
