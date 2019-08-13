package edu.mum.cs.cs425.junit.part1test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.junit.part1.ArrayFlattener;

public class ArrayFlattenerTest {
	
	private ArrayFlattener arrayFlattener = null;

	@Before
	public void setUp() throws Exception {
		this.arrayFlattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.arrayFlattener = null;
	}

	@Test
	public void testFlattenArray() {
		
		Integer[][] a_in = { {1,3}, {0}, {4,5,9} };
		Integer[] outputArray = arrayFlattener.flattenArray(a_in);
		Integer[] expected = { 1, 3, 0, 4, 5, 9 };
		boolean result = Arrays.equals(outputArray, expected);
		assertTrue(result);
	}
	
	@Test
	public void testFlattenArray2() {
		int[][] inputArray = { {1,3}, {0}, {4,5,9} };
		int[] outputArray = arrayFlattener.flattenArray2(inputArray);
		int[] expected = { 1, 3, 0, 4, 5, 9 };
		boolean result = Arrays.equals(outputArray, expected);
		assertTrue(result);
	}

}
