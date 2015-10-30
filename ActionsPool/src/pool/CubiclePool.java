package pool;

public class CubiclePool extends ResourcePool<Cubicle>{

	/**
	 * the constructor of a cubicle pool
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
