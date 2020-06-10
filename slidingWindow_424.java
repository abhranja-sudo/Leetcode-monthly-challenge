import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> charFrequency = new HashMap<>();
        int start = 0, end = 0, maxLen = 0, maxFrequency = 0;
        while(end!=s.length()){
            char endChar = s.charAt(end);
            charFrequency.put(endChar,charFrequency.getOrDefault(endChar,0)+1);
            maxFrequency = Math.max(maxFrequency,charFrequency.get(endChar));
            while(end-start+1-maxFrequency > k){
            	char startChar = s.charAt(start);
            	charFrequency.put(startChar,charFrequency.get(startChar)-1);
            	start++;
            }

            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}