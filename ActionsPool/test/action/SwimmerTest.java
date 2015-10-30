package action;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pool.BasketPool;
import pool.CubiclePool;

public class SwimmerTest extends SequentialSchedulerTest {

	private Swimmer swimmer;
	private BasketPool baskets = new BasketPool(1);
	private CubiclePool cubicles = new CubiclePool(1);
	
	@Before
	public void createSwimmer() {
		this.swimmer = new Swimmer("Camille", baskets, cubicles, 1, 1, 1);
	}
	
	@Test
	public void testIsReady() {
		assertTrue(this.swimmer.isReady);
	}
	
	@Test
	public void testIsFinished() {
		assertFalse(this.swimmer.isFinished());
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		assertTrue(this.swimmer.isFinished());	
	}
	
	@Test 
	public void testIsInProgress() {
		assertFalse(this.swimmer.isInProgress());
		this.swimmer.doStep();
		assertTrue(this.swimmer.isInProgress());
		assertFalse(this.swimmer.isFinished());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testaddActionException() {
		Swim swim = new Swim(0);
		this.swimmer.addAction(swim);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testAddActionException2() {
		Swim swim = new Swim(1);
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.doStep();
		this.swimmer.addAction(swim);
	}

}
