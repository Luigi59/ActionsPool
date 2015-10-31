package action;

import static org.junit.Assert.*;

import org.junit.Test;

import pool.Basket;
import pool.BasketPool;
import pool.ResourcefulUser;

public class ResourceActionTest extends ActionTest {

	protected BasketPool pool;
	protected ResourcefulUser<Basket> user;
	
	protected Action createAction() {
		return new ResourceAction<Basket>(2,pool,user);
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
	public void testIsFinsihed() {
		assertFalse(super.a.isFinished());
		super.a.doStep();
		super.a.doStep();
		assertTrue(super.a.isFinished());
	}

}
