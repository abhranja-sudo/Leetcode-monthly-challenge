
// Given a string and a pattern, find out if the string contains any permutation of the pattern.


import java.util.*;

class StringPermutation {
  public static boolean findPermutation(String str, String pattern) {

    Map<Character,Integer> freqPattern = new HashMap<>();

    for(int i = 0; i < pattern.length(); i++){
    	freqPattern.put(pattern.charAt(i),freqPattern.getOrDefault(pattern.charAt(i),0)+1);
    }
    int end = 0, start = 0, match = 0;

    while(end!=str.length()){

		if(end >= pattern.length()){
    		char startChar = str.charAt(start);
    		if(freqPattern.containsKey(startChar)){
    			int count = freqPattern.get(startChar);
				if(count == 0)	match--;
    			freqPattern.put(startChar,count+1);
    		}
    		start++;
    	}

    	char endChar = str.charAt(end);
    	if(freqPattern.containsKey(endChar) ){
    		int count = freqPattern.get(endChar);
			freqPattern.put(endChar,count-1);
			if(count-1 == 0)	match++;
    	}
		if(match==freqPattern.size())	return true;
    	
		end++;

    }
    return false;
 }
  
}
