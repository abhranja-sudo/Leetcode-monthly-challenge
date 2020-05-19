class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones = list(i*-1 for i in stones)
        heapq.heapify(stones)
        while len(stones)>1:
            diff = heapq.heappop(stones) * -1 - heapq.heappop(stones)*-1
            if diff>0:
                heapq.heappush(stones,diff*-1)
        if stones:
            return stones[0]*-1
        else:
            return 0
                   