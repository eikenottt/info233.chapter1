package no.uib.info233v17.lab.chapter1.exercise2to4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class GroceryBag {
	
	
	private int capacity;
	private List<String> bag;
	
	
	public GroceryBag() {
		capacity = 10;
		bag = new ArrayList<>();
	}

    public int getCapacity() {
		return capacity;
	}

	private List<String> getBag() {
		return bag;
	}

	public void setBag(ArrayList<String> bag) {
		this.bag = bag;
	}

	public boolean add(String newEntry) {
		return bag.size() < capacity && bag.add(newEntry);
	}
	
	public boolean removeSoup() {
		
		int counter = 0;
		ArrayList<String> tempBag = new ArrayList<>();
		
		for (String string : bag) {
			if(string.equals("soup")) {
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

	public int size() {
		return bag.size();
	}

	public int countSoup() {
		int counter = 0;
		String soup = "soup";
		for (String string : bag) {
			if(string.equals(soup)) counter++;
		}
		return counter;
	}
	
	public List<String> toArray() {
		return getBag();
	}

	public List<String> toDistinctArray() {
		List<String> myNewBag = new ArrayList<>();
		
		for (String string : bag) {
			if(!myNewBag.contains(string)) myNewBag.add(string);
		}
		
		return myNewBag;
	}

	// TODO add BagInterface<String> everything = bag1.union(bag2)

    public static void main(String[] args) {

    }
}
