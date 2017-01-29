package no.uib.info233v17.lab.chapter1.exercise2to4.tests;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;


import org.junit.Before;
import org.junit.Test;

import no.uib.info233v17.lab.chapter1.exercise2to4.GroceryBag;

public class GroceryBagTest {

	private GroceryBag bag;
	private String[] nineItems;
	
	@Before
	public void setUp() throws Exception {
		bag = new GroceryBag();
		nineItems = new String[] {"soup","soup","hair","hair","ball","ball","soup","cat","fish"};
		for (String string : nineItems) {
			bag.add(string);
		}
	}
	
	@Test
	public void testCountSoup() {
		assertEquals(3, bag.getFrequencyOf("soup"));
	}

	@Test
	public void testSize() {	
		assertEquals(9, bag.getCurrentSize());
	}
	
	@Test
	public void testAdd() {
		bag.add("soup");
		bag.add("soup");
		assertFalse(bag.add("soup"));
	}
	
	@Test
	public void testRemoveSoup() {
		assertTrue(bag.remove("soup"));
		assertEquals(0, bag.getFrequencyOf("soup"));
	}
	
	@Test
	public void testDistinctArray() {
		String[] list = {"soup","hair","ball","cat","fish"};
		List<String> experctedArray = Arrays.asList(list);
		assertEquals(experctedArray, bag.toDistinctArray());
	}

}
