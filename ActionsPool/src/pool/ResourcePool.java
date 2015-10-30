package pool;

import java.util.ArrayList;

public abstract class ResourcePool<T extends Resource> {
	
	protected ArrayList<T> resources;
	protected ArrayList<T> usedResources;
	
	/**
	 * the constructor of a resource pool
	 * @param nbResources the number of resources
	 */
	public ResourcePool(int nbResources) {
		resources = new ArrayList<T>(nbResources);
		usedResources = new ArrayList<T>();
		for(int i=0; i<nbResources; i++) {
			resources.add(createResource());
		}
	}
	
	/**
	 * create a resource
	 * @return the created resource
	 */
	protected abstract T createResource();
	
	/**
	 * provides a resource of the pool
	 * @return the resource of the pool
	 */
	public T provideResource() {
		if (resources.isEmpty())
			return null;
		T resource = resources.get(0);
		usedResources.add(resource);
		resources.remove(resource);
		return resource;
	}
	
	/**
	 * frees a resource
	 * @param resource the resource to free
	 */
	public void freeResource(T resource) {
		if(!usedResources.contains(resource)) {
			throw new IllegalArgumentException("Not part of this pool");
		}
		resources.add(resource);
		usedResources.remove(resource);
	}
	
	

}
