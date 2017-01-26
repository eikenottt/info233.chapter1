package no.uib.info233v17.lab.chapter1.exercise2.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import no.uib.info233v17.lab.chapter1.exercise2.GroceryBag;

public class GroceryBagTest<T> {
	
	private GroceryBag<String> bag;
	private String[] nineItems;
	
	@Before
	public void setup() {
		bag = new GroceryBag<>();
		
		String[] nineItems = {"soup","doll","golfball","candy","soup","flag","rose","flag","doll"};
	}

	@Test
	public void testAdd() {
		String soup = "soup";
		
		bag.add(nineItems);
	}

}
