# You are given a sorted array consisting of only integers where every element appears exactly twice, 
# except for one element which appears exactly once. Find this single element that appears only once.
# Note: Your solution should run in O(log n) time and O(1) space.


 

class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        low = 0
        high = len(nums)
        if high==1:
            return nums[0]
        else:
            while(low<=high):
                if low==high:
                    return nums[low]
                # print(low)
                # print(high)
                mid = (low+high)//2
                if mid+1<len(nums) and nums[mid]==nums[mid+1]:
                    if mid%2 == 0:
                        low = mid+1
                    else:
                        high = mid-1

                elif mid>=0 and nums[mid]==nums[mid-1]:
                    if (mid-1)%2 == 0:
                        low = mid+1
                    else:
                        high = mid-1
                else:
                    # print(mid)
                    return nums[mid]
