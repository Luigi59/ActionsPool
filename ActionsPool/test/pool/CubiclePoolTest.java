package pool;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubiclePoolTest extends ResourcePoolTest {
	
	@Test
	public void testcreateResource() {
		assertNotNull(cubicles.createResource());
	}

}
