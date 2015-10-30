package pool;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasketPoolTest extends ResourcePoolTest{

	private BasketPool baskets2;
	
	@Test
	public void testcreateResource() {
		this.baskets2 = new BasketPool(0);
		assertNotNull(this.baskets2.createResource());
	}

}
