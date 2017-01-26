package no.uib.info233v17.lab.chapter1.exercise2.interfaces;

abstract public interface BagInterface<T> {
	
	//for adding items to bag
	boolean add(String newEntry);
	
	boolean remove(Object anEntry);
	
	void clear();
	
	boolean contains(Object anEntry);
	
	boolean isEmpty();
	
	int size();
	
	Object[] toArray();
	
}
