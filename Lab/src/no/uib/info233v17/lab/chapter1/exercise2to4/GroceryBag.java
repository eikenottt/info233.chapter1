package no.uib.info233v17.lab.chapter1.exercise2to4;

import no.uib.info233v17.lab.chapter1.exercise2to4.interfaces.BagInterface;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GroceryBag<T> implements BagInterface<T> {
	
	
	private int capacity;
	private ArrayList<T> bag;
	
	
	public GroceryBag() {
		capacity = 10;
		bag = new ArrayList<>();
	}

    public int getCapacity() {
		return capacity;
	}

	public ArrayList<T> getBag() {
		return bag;
	}

	public void setBag(ArrayList<T> bag) {
		this.bag = bag;
	}

	@Override
	public int getCurrentSize() {
		return bag.size();
	}

	@Override
	public boolean isFull() {
		return getCurrentSize() >= getCapacity();
	}

	@Override
	public boolean isEmpty() {
		return getCurrentSize() <= 0;
	}

	@Override
	public boolean add(T newEntry) {
		return bag.size() < capacity && bag.add(newEntry);
	}

	@Override
	public T remove() {
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		int counter = 0;
		ArrayList<T> tempBag = new ArrayList<>();

		for (T string : bag) {
			if(string.equals(anEntry)) {
				tempBag.add(string);
				counter++;
			}
		}

		if(counter > 0){
			bag.removeAll(tempBag);
			return true;
		}
		return false;
	}

	@Override
	public void clear() {
        bag.clear();
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		int counter = 0;
		for (T string : bag) {
			if(anEntry.equals(string)) counter++;
		}
		return counter;
	}

	public ArrayList<T> toDistinctArray() {
		ArrayList<T> myNewBag = new ArrayList<>();
		
		for (T string : bag) {
			if(!myNewBag.contains(string)) myNewBag.add(string);
		}
		
		return myNewBag;
	}

	// TODO add BagInterface<String> everything = bag1.union(bag2)

    @Override
    public String toString() {
        return "GroceryBag{" +
                "bag=" + bag +
                '}';
    }

    public static void main(String[] args) {
        BagInterface<String> handlepose = new GroceryBag<>();
        String[] handleliste = {"egg","soup","carrot","milk"};

        for (String s : handleliste) {
            handlepose.add(s);
        }
        System.out.println(handlepose.toString());
    }
}
