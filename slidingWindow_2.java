// Given a string, find the length of the longest substring in it with no more than K distinct characters.

import java.util.*;

class LongestSubstringKDistinct {

  public static int findLength(String str, int k) {

  	int windowStart = 0;
  	int windowEnd = 0;
    Map<Character,Integer> charFrequencyMap = new HashMap<>();
    int maxSize = 0;


    while(windowEnd!=str.length()){
    	char rightChar = str.charAt(windowEnd);
    	charFrequencyMap.push(rightChar,charFrequencyMap.getOrDefault(rightChar,0)+1);
      
    	while(charFrequencyMap.size()>k){
    		char leftChar = str.charAt(windowStart);
    		charFrequencyMap.push(leftChar,charFrequencyMap.getOrDefault(leftChar,0)-1);
    		if(charFrequencyMap.get(leftChar)==0)	charFrequencyMap.remove(leftChar);
        windowStart++;
    	}
    	maxSize = Math.max(maxSize,windowEnd-windowStart+1);
      windowEnd++;
   	}
   	return maxSize; 
  }
}

