package no.uib.info233v17.lab.chapter1.exercise2;

import no.uib.info233v17.lab.chapter1.exercise2.interfaces.BagInterface;

public class GroceryBag<T> implements BagInterface<T>{
	
	
	private int capacity;
	

	public GroceryBag() {
		capacity = 10;
	}

	public GroceryBag(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}
