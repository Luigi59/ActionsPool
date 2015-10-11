package action;

import pool.Resource;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class ResourceAction<T extends Resource> extends Action {
	
	ResourcePool<T> pool;
	ResourcefulUser<T> user;

	public ResourceAction(int timeToEnd, ResourcePool<T> pool, ResourcefulUser<T> user) {
		super(timeToEnd);
		super.remainingTime = timeToEnd;
		this.pool = pool;
		this.user = user;
	}
	
	public boolean isReady() {
		return remainingTime == totalTime;
	}

	public boolean isInProgress() {
		return !isReady() && !isFinished();
	}
	
	public boolean isFinished() {
		return remainingTime <= 0;
	}

	public void doStep() {
		remainingTime--;
	}

}
