package pool;

import static org.junit.Assert.*;

import org.junit.Test;

import pool.Basket;

public class BasketTest {
	
	private Basket b ;
	
	@Test
	public void testDescription() {
		this.b = new Basket();
		assertEquals("This is a basket",b.description());
		
	}

}
