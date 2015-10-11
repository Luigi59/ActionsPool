package action;

import pool.Resource;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class FreeResourceAction<T extends Resource> extends ResourceAction {

	public FreeResourceAction(int timeToEnd, ResourcePool pool,
			ResourcefulUser user) {
		super(timeToEnd, pool, user);
	}

}
