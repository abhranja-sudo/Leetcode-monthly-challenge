// Given an array of characters where each character represents a fruit tree, you are given two baskets and your goal is to put maximum number of fruits in each basket. The only restriction is that each basket can have only one type of fruit.

// You can start with any tree, but once you have started you can’t skip a tree. You will pick one fruit from each tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.

// Write a function to return the maximum number of fruits in both the baskets.

import java.util.*;

class MaxFruitCountOf2Types {
  public static int findLength(char[] arr) {
  	int start = 0;
  	int end = 0;

  	Map<Character,Integer> freqOfChar = new HashMap<>();
  	int maxFruit = 0;

  	while(end!=arr.length){
  		char endChar = arr[end];
  		freqOfChar.put(endChar,freqOfChar.getOrDefault(endChar,0)+1);
  		
  		while(freqOfChar.size()>2){
  			Character startChar = arr[start];
  			freqOfChar.put(startChar,freqOfChar.getOrDefault(startChar,0)-1);
  			if(freqOfChar.get(startChar)==0)	freqOfChar.remove(startChar);
  			start++;
  		}
  		maxFruit = Math.max(maxFruit,end-start+1);
  		end++;
  	}
    // TODO: Write your code here
    return maxFruit;
  }
}