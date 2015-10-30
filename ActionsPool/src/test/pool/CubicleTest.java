package test.pool;

import static org.junit.Assert.*;

import org.junit.Test;

import pool.Cubicle;

public class CubicleTest {

	private Cubicle c;
	@Test
	public void testDescription() {
		this.c = new Cubicle();
		assertEquals("This is a cubicle",c.description());
	}

}
