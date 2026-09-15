class Solution {
    public int pivotIndex(int[] nums) {
        int prefix = 0;
        int totalSum = 0;
        for(int i : nums)
        {
            totalSum+= i;
        }
        for(int i = 0;i<nums.length;i++)
        {
           int suffix = totalSum - prefix  - nums[i]; 
           if(prefix == suffix) return i;
            prefix = prefix + nums[i];  
        }
        return -1;
    }
}