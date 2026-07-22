class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        m=max(nums)
        sum=0
        for i in nums:
            if sum+i>i:
                sum+=i
            else:
                sum=i
            if sum>m:
                m=sum
        return m