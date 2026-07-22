class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        h=1 #highest
        l=1 #lowest
        ph=1 #past highest
        pl=1 #past lowest
        m=max(nums)
        
        for i in nums:
            h=ph*i
            l=pl*i
            ph=max(h,l,i)
            pl=min(h,l,i)

            if m<ph:
                m=ph
        return m