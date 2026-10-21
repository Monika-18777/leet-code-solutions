class Solution:
    def minEatingSpeed(self, piles: list[int], h: int) -> int:
        left = 1
        right = max(piles)
        while left <= right:
            mid = (left + right) //2
            minimum = 0
            for i in piles:
                minimum += math.ceil(i/mid)
            if minimum <= h:
                right = mid -1
            else:
                left = mid +1
        return left