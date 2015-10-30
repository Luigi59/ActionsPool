package pool;

public class ResourcefulUser<R extends Resource> {

	protected R resource;
	
	/**
	 * gives the resource
	 * @return the resource of the user
	 */
	public R getResource() {
		return resource;
	}
	
	/**
	 * setting the resource
	 * @param resource the resource to set
	 */
	public void setResource(R resource) {
		this.resource = resource;
	}
	
	/**
	 * resets the resource
	 */
	public void resetResource() {
		this.resource = null;
	}
}
