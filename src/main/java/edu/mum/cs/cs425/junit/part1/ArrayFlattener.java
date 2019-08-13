package edu.mum.cs.cs425.junit.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.mum.cs.cs425.junit.part2.service.ArrayFlattenerService;

public class ArrayFlattener implements ArrayFlattenerService{
	
	@Override
	public Integer[] flattenArray(Integer[][] inputArray) {
		if (inputArray == null) 
			return null;
        List<Integer> list = new ArrayList<>();
        
        for (Integer[] arr : inputArray) {
            for (int i : arr) {
                list.add(i);
            }
        }
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }		
	
	public int[] flattenArray2(int[][] inputArray) {
		if (inputArray == null) 
			return null;
		
		return Arrays.stream(inputArray)
					 .flatMapToInt(arr -> Arrays.stream(arr))
				      .toArray();
	}
}
