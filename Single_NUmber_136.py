# Given a non-empty array of integers, every element appears twice except
#  for one. Find that single one.

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        Dict = {}
        for i in nums:
            if i in Dict:
                Dict[i]+=1
            else:
                Dict[i] = 1
        for key in Dict:
            if Dict[key]==1:
                return key

# Below one has space complexity of o(1) 
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0
        for i in nums:
            xor = xor^i
        return xor