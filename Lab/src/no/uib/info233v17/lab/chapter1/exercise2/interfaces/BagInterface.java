package no.uib.info233v17.lab.chapter1.exercise2.interfaces;

public interface BagInterface<T> {
	
	//for adding items to bag
	boolean add(T newEntry);
	
	boolean remove(Object anEntry);
	
	void clear();
	
	boolean contains(Object anEntry);
	
	boolean isEmpty();
	
	int size();
	
	Object[] toArray();
	
}
