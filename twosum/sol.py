class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        prevMap = {} # holds the val : index
        for i, n in enumerate(nums):
            complement = target - n
            if complement in prevMap:
                return [prevMap[complement], i]
            prevMap[n] = i
