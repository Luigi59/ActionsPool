package pool;

public class BasketPool extends ResourcePool<Basket> {
	
	/**
	 * the constructor of a basket pool
	 * @param nbResource the number of baskets
	 */
	public BasketPool(int nbResource) {
		super(nbResource);
	}
	
	/**
	 * create a resource basket
	 * @return a basket
	 */
	protected Basket createResource() {
		return new Basket();
	}

}
