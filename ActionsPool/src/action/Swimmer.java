package action;

import pool.Basket;
import pool.Cubicle;
import pool.ResourcePool;
import pool.ResourcefulUser;

public class Swimmer extends SequentialScheduler {
	
	protected String name;
	protected ResourcePool<Basket> baskets;
	protected ResourcePool<Cubicle> cubicles;
	protected TakeResourceAction<Basket> trab;
	protected TakeResourceAction<Cubicle> trac;
	protected FreeResourceAction<Basket> frab;
	protected FreeResourceAction<Cubicle> frac;
	protected ResourcefulUser<Basket> userb;
	protected ResourcefulUser<Cubicle> userc;
	protected ResourcefulUser<Cubicle> userc2;
	protected Undress undress;
	protected Swim swim;
	protected Dress dress;
	protected Basket basket;
	protected Cubicle cubicle;
	
	/**
	 * the constructor of a swimmer
	 * @param name the name of the swimmer
	 * @param baskets the resource pool of baskets
	 * @param cubicles the resource pool of cubicles
	 * @param undressTime the duration of the action undressing
	 * @param swimTime the duration of the action swimming
	 * @param dressTime the duration of the action dressing
	 */
	public Swimmer(String name, ResourcePool<Basket> baskets, ResourcePool<Cubicle> cubicles, int undressTime, 
			int swimTime, int dressTime) {
		
		this.name = name;
		this.baskets = baskets;
		this.cubicles = cubicles;
		
		userb = new ResourcefulUser<Basket>();
		userc = new ResourcefulUser<Cubicle>();
		userc2 = new ResourcefulUser<Cubicle>();
		
		trab = new TakeResourceAction<Basket>(1, baskets, userb, name, "basket");
		trac = new TakeResourceAction<Cubicle>(1, cubicles, userc, name, "cubicle");
		frac = new FreeResourceAction<Cubicle>(1, cubicles, userc, name, "cubicle");
		frab = new FreeResourceAction<Basket>(1, baskets, userb, name, "basket");
		
		undress = new Undress(undressTime);
		swim = new Swim(swimTime);
		dress = new Dress(dressTime);
		
		// the swimmer reserve a basket
		this.addAction(trab);
		// the swimmer reserve a cubicle
		this.addAction(trac);
		// the swimmer is undressing
		this.addAction(undress);
		// the swimmer release the cubicle
		this.addAction(frac);
		// the swimmer is swimming
		this.addAction(swim);
		
		trac = new TakeResourceAction<Cubicle>(1, cubicles, userc2, name, "cubicle");
		frac = new FreeResourceAction<Cubicle>(1, cubicles, userc2, name, "cubicle");
		// the swimmer reserve a cubicle
		this.addAction(trac);
		// the swimmer is dressing
		this.addAction(dress);
		// the swimmer release the cubicle
		this.addAction(frac);
		// the swimmer release the basket
		this.addAction(frab);
	}
	
	@Override
	public void doStep() {
		System.out.println(this.name + "'s turn");
		super.doStep();
	}

}
