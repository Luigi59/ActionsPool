package pool;

public class CubiclePool extends ResourcePool<Cubicle>{

	/**
	 * the cubicles of a pool
	 * @param nbResource the number of cubicles
	 */
	public CubiclePool(int nbResource) {
		super(nbResource);
	}
	
	/**
	 * create a resource cubicle
	 * @return a cubicle
	 */
	protected Cubicle createResource() {
		return new Cubicle();
	}
}
