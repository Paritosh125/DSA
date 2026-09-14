class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxending = nums[0];
        int minending = nums[0];
        int sum = nums[0];
        int res = nums[0];
        int res2 = nums[0];
         for(int i = 1; i<nums.length;i++)
        {
            maxending  = Math.max(maxending + nums[i],nums[i]);
            minending = Math.min(minending + nums[i],nums[i]);
            sum +=nums[i];
            res = Math.max(res,maxending);
            res2 = Math.min(res2,minending);
        }
        if(res < 0) return res ;
        sum = sum - res2;
        res = Math.max(res,sum);
        return res;
    }
}