// Given an array of n positive integers and a positive integer s, 
// find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.



class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        
        int windowStart = 0;
        int windowEnd = 0;
        int windowSize = 0;
        int windowSum = 0;
        int minSize = 0;
        
        while(windowEnd!=nums.length || windowSum>=s){
            if(windowSum < s){
                windowSum+=nums[windowEnd];
                windowEnd++;
                windowSize++;
            }
            else{
                if(minSize == 0)    minSize = windowSize;
                // System.out.println(minSize);
                windowSum-=nums[windowStart];
                windowSize--;
                windowStart++;
                if(windowSum>=s)    minSize= Math.min(windowSize,minSize);
            }
        }
       
        return minSize;
        
    }
}