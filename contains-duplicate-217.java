// Given an array of integers, find if the array contains any duplicates.

// Your function should return true if any value appears at least twice in the array, 
// and it should return false if every element is distinct.





class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            else{
                map.put(nums[i],true);
            }        
        }
        return false;
    }
}