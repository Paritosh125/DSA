class Solution {
    public int findFirst(int[] nums , int target)
    {
        int answer = -1;
        int low = 0 ;
        int high = nums.length - 1;
        while(low <=high)
        {
            int guess = (low + high) / 2 ;
            if(nums[guess] < target)
            {
                low = guess + 1;
            }
            else if(nums[guess]>target)
            {
                high = guess - 1;
            }
            else
            {
                answer = guess ;
                high = guess - 1;
            }
        }
        return answer ;
    }
    public int findLast(int[] nums , int target)
    {
        int answer = -1;
        int low = 0 ; 
        int high = nums.length - 1;
        while(low <= high)
        {
            int guess = (low + high )/2 ; 
            if(nums[guess]< target)
            {
                low = guess + 1;
            }
            else if(nums[guess] > target)
            {
                high = guess - 1;
            }
            else
            {
                answer = guess;
                low = guess + 1;
            }
        }
        return answer ;
    }
   
    public int[] searchRange(int[] nums, int target) {
       int first = findFirst(nums ,target);
       int last = findLast(nums, target);
       return new int[]{first,last};
    }
}