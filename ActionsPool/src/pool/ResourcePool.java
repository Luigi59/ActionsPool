package pool;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public abstract class ResourcePool<T extends Resource> {
	
	ArrayList<T> resources;
	ArrayList<T> usedResources;
	
	public ResourcePool(int nbResources) {
		resources = new ArrayList<T>(nbResources);
		usedResources = new ArrayList<T>();
		for(int i=0; i<nbResources; i++) {
			resources.add(createResource());
		}
	}
	
	protected abstract T createResource();
	
	public T provideResource() {
		if (resources.isEmpty())
			throw new NoSuchElementException();
		T resource = resources.get(0);
		usedResources.add(resource);
		resources.remove(resource);
		return resource;
	}
	
	public void freeResource(T resource) {
		if(!usedResources.contains(resource))
			throw new IllegalArgumentException("Not part of this pool");
		resources.add(resource);
		usedResources.remove(resource);
	}
	
	

}
