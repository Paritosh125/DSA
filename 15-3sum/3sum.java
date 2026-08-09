class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        
        
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++)
        {
            int left = i+1;
        int right = n - 1;
            if(i>0 && nums[i]==nums[i-1])
            continue;

           
            int target = -1 * nums[i];

            while(left<right)
            {
                 int s = nums[left] + nums[right];
                if(s == target)
            {
                 res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                 left++;
                 right--;
                 while(left < n && nums[left] == nums[left-1])
                 {
                    left++;
                 }
                 while(right >= n && nums[right] == nums[right+1])
                 {
                    right--;
                 }
            }
            else if(s<target)
            left++;
            else
            right--;
        }
            }
        return res;
    }
}