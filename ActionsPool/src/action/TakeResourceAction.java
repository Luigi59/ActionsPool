package action;

import pool.Resource;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class TakeResourceAction<T extends Resource> extends ResourceAction<T> {
	
	protected String username;
	protected String poolname;
	protected ResourcefulUser<T> user;

	/**
	 * the constructor of the action to take resource
	 * @param timeToEnd the duration of the action
	 * @param pool the resource pool
	 * @param user the resourceful user
	 * @param username the name of the user
	 * @param poolname the name of the pool
	 */
	public TakeResourceAction(int timeToEnd, ResourcePool<T> pool,
			ResourcefulUser<T> user, String username, String poolname) {
		super(timeToEnd, pool, user);
		this.username = username;
		this.poolname = poolname;
		this.user = user;
	}
	
	@Override
	public void doStep() {
		System.out.print(username + " trying to take resource from pool " + poolname + "... ");
		user.setResource(pool.provideResource());
		if(user.getResource() != null) {
			System.out.println("success");
			super.doStep();
		} else
			System.out.println("failed");
	}

	
}
