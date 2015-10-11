package action;

import pool.Resource;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class TakeResourceAction<T extends Resource> extends ResourceAction {

	public TakeResourceAction(int timeToEnd, ResourcePool pool,
			ResourcefulUser user) {
		super(timeToEnd, pool, user);
	}
	
	

	
}
