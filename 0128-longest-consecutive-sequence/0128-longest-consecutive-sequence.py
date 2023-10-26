class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hset = set(nums)
        longest = 0
        for n in hset:
            if (n - 1) not in hset:
                length = 0
                while (n + length) in hset:
                    length += 1
                longest = max(length, longest)
        return longest
            
            