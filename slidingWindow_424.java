// Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.

// In one operation, you can choose any character of the string and change it to any other uppercase English character.

// Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.


import java.util.*;
class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> charFrequency = new HashMap<>();
        int start = 0, end = 0, maxLen = 0, maxFrequency = 0;
        while(end!=s.length()){
            char endChar = s.charAt(end);
            charFrequency.put(endChar,charFrequency.getOrDefault(endChar,0)+1);
            maxFrequency = Math.max(maxFrequency,charFrequency.get(end));
            while(end-start+1-maxFreq > k){
            	char startChar = charFrequency.charAt(start);
            	charFrequency.put(startChar,charFrequency.get(start)-1);
            	start++;
            }

            maxLen = Math.max(maxLen,end-start+1);
            end++;
        }
        return maxLen;
    }
}