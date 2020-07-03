// Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, 
// find the length of the longest contiguous subarray having all 1s.

class ReplacingOnes {
  public static int findLength(int[] arr, int k) {
    int arrFreq[] = {0,0};
    int start = 0, end = 0, maxLen = 0;
    while(end!=arr.length){
    	int binaryEnd = arr[end];
    	arrFreq[binaryEnd]++;

    	while(end-start+1-arrFreq[1]>k){
    		int binaryStart = arr[start];
    		arrFreq[binaryStart]--;
    		start++;
    	}
    	maxLen = Math.max(maxLen,end-start+1);
    	end++;
    }
    return maxLen;
  }
}