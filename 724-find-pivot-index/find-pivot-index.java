class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int tsum=0;
        int rsum=0;
        for(int i: nums){
            tsum+=i;
        }
        for(int i=0;i<nums.length;i++){
            rsum=tsum-sum-nums[i];
            if(rsum==sum)
            return i;
            sum+=nums[i];
        }

        return -1;
    }
}