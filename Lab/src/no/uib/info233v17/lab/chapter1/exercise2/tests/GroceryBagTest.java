package no.uib.info233v17.lab.chapter1.exercise2.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import no.uib.info233v17.lab.chapter1.exercise2.GroceryBag;

public class GroceryBagTest {

	private GroceryBag bag;
	private String[] nineItems;
	
	@Before
	public void setUp() throws Exception {
		bag = new GroceryBag();
		nineItems = new String[] {"soup","soup","golfball","hair","ball","moon","dog","cat","fish"};
		for (String string : nineItems) {
			bag.add(string);
		}
	}
	
	@Test
	public void testCountSoup() {
		bag.add("soup");
		assertEquals(3, bag.countSoup());
	}

	@Test
	public void testSize() {	
		assertEquals(9, bag.size());
	}
	
	@Test
	public void testAdd() {
		assertEquals(true, bag.add("soup"));
	}
	
	@Test
	public void testRemoveSoup() {
		assertTrue(bag.removeSoup());
		assertEquals(0, bag.countSoup());
	}

}
