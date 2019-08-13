package edu.mum.cs.cs425.junit.part2test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.junit.part2.ArrayReversor;
import edu.mum.cs.cs425.junit.part2.service.ArrayFlattenerService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ArrayReversorNullTest {
    private ArrayReversor arrayReversor;

    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

    @Before
    public void setUp() throws Exception {
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception {
        this.arrayReversor = null;
    }

    @Test
    public void testReverseArrayNull() {
    	
        Integer[][] inputArray = null;
        
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(null);
        
        Integer[] actual = arrayReversor.reverseArray(inputArray);
        Integer[] expected = null;
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(inputArray);
    }
}