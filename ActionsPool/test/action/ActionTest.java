package action;

import org.junit.Before;

import action.Action;

public abstract class ActionTest {

	Action a = createAction();
	
	protected abstract Action createAction();
	
	@Before
	public void initialize() {
		a = createAction();
	}

}
