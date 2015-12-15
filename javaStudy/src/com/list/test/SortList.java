package com.list.test;

import java.util.LinkedList;
import java.util.List;

public class SortList {
	
	//버블정렬
		public int[] bubbleSort(int[] numbers){
			boolean numbersSwitched;
			
			do{
				numbersSwitched=false;
				for(int i=0;i<numbers.length-1;i++){
				if(numbers[i+1]<numbers[i]){
				
					int tmp=numbers[i+1];
					numbers[i+1]=numbers[i];
					numbers[i]=tmp;
					numbersSwitched=true;
				
				}
				}
				
			}
			while(numbersSwitched);
			
			return numbers;
		}
		
		//삽입정렬
		public List<Integer> insertSort(final List<Integer> numbers){
			final List<Integer> sortedList = new LinkedList<>(); 
			
			originalList:for(Integer number: numbers){
				for(int i=0; i<sortedList.size();i++){
		
					if(number<sortedList.get(i)){
					sortedList.add(i,number);
					continue originalList;
				}
			}
			sortedList.add(sortedList.size(), number);
		}
			
			
			
			return sortedList;
			
		}
		
		

}
