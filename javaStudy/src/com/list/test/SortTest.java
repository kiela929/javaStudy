package com.list.test;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Test;

public class SortTest {

	SortList sortList = new SortList();
	
	
	//버블정렬 테스트
	@Test
	public void bubbleSortTest(){
		final int[] numbers={4,5,2,0,6,1,3};
		final int[]	expected={0,1,2,3,4,5,6};
		
		assertArrayEquals(expected, sortList.bubbleSort(numbers));
	}
	
	//삽입정렬 테스트
	@Test 
	public void insertSortTest(){
		final List<Integer> numbers = null;
		final Integer[] arrNumber={4,5,2,0,6,1,3};
		
		for(Integer check : arrNumber){
			numbers.add(check);
		}
		
		
			
	}
}
