class Solution:
    def jump(self, nums: List[int]) -> int:
       if len(nums)==1:
        return 0
       c=0
       j=0
       f=0

       for i in range(len(nums)):
            f=max(f,i+nums[i])
            if i==c:
                j+=1
                c=f
            if c>=len(nums)-1:
                return j

         
            
