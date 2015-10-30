package action;

import pool.Resource;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class FreeResourceAction<T extends Resource> extends ResourceAction<T> {
	
	protected String username;
	protected String poolname;
	protected ResourcefulUser<T> user;

	/**
	 * the constructor of the action to free resource
	 * @param timeToEnd the duration of the action
	 * @param pool the resource pool
	 * @param user the resourceful user
	 * @param username the name of the user
	 * @param poolname the name of the pool
	 */
	public FreeResourceAction(int timeToEnd, ResourcePool<T> pool,
			ResourcefulUser<T> user, String username, String poolname) {
		super(timeToEnd, pool, user);
		this.username = username;
		this.poolname = poolname;
		this.user = user;
	}
	
	@Override
	public void doStep() {
		System.out.println(username + " freeing resource from pool " + poolname);
		pool.freeResource(user.getResource());
		super.doStep();
	}

}
