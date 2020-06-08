// Given a string, find the length of the longest substring which has no repeating characters.

// 
import java.util.*;
class NoRepeatSubstring {
  public static int findLength(String str) {
  	Set<Character> set = new HashSet<>();
  	int maxLen = 0;
  	int start = 0;
  	int end = 0;

  	while(end!=str.length()){
  		char endChar = str.charAt(end);				
  		if(set.contains(endChar)){
  			set.remove(str.charAt(start));
  			start++;
        continue;
  		}
  		set.add(str.charAt(end));
  		maxLen = Math.max(maxLen,end-start+1);
  		end++;
  	}
    // TODO: Write your code here
    return maxLen;
  }
}
