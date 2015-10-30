package pool;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ResourcePoolTest {

	private ResourcePool<Basket> baskets;
	protected ResourcePool<Cubicle> cubicles;
	private Basket b;
	private Basket b2;
	
	@Before
	public void createResourcePool() {
		this.baskets = new BasketPool(1);
		this.cubicles = new CubiclePool(0);
		this.b = this.baskets.resources.get(0);
		this.b2 = new Basket();
	}
	
	@Test
	public void testProvideResource() {
		assertEquals(null,this.cubicles.provideResource());
		assertEquals(b,this.baskets.provideResource());
	}
	
	@Test
	public void testFreeResource() {
		this.baskets.freeResource(this.baskets.provideResource());
		assertNotNull(this.baskets.resources);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testFreeResourceException() {
				this.baskets.freeResource(b2);
	}

}
