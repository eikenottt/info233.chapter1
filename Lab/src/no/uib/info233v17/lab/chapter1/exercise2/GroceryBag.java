package no.uib.info233v17.lab.chapter1.exercise2;

import java.util.ArrayList;
import java.util.List;

public class GroceryBag {
	
	
	private int capacity;
	private List<String> bag;
	
	
	public GroceryBag() {
		setCapacity(10);
		bag = new ArrayList<>();
	}

	public GroceryBag(int capacity) {
		setCapacity(capacity);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<String> getBag() {
		return bag;
	}

	public void setBag(ArrayList<String> bag) {
		this.bag = bag;
	}

	public boolean add(String newEntry) {
		if(bag.size() >= capacity) return false;
		return bag.add(newEntry);
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
	
}
