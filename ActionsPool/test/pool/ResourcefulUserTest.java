package pool;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pool.Basket;
import pool.ResourcefulUser;

public class ResourcefulUserTest {

	private ResourcefulUser<Basket> user;
	private Basket b;
	
	@Before
	public void createResourcefulUser() {
		this.user = new ResourcefulUser<Basket>();
		this.b = new Basket();
	}
	
	@Test
	public void testGetResource() {
		assertNull(user.getResource());	
	}
	
	@Test
	public void testSetResource() {
		user.setResource(b);
		assertEquals(b,user.getResource());
	}
	
	@Test
	public void testResetResource() {
		user.setResource(b);
		user.resetResource();
		assertNull(user.getResource());
	}

}
