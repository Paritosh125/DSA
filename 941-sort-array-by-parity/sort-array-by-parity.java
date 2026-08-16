class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int slow = 0;
        for(int fast = 0; fast < n ; fast++)
        {
            if( (nums[fast]%2) == 0)
            {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;

                slow++;
            }
        }
        return nums ;
        
    }
}