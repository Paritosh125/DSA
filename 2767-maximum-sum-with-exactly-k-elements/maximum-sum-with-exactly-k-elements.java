class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        for (int i = 0; i < k; i++) {
            sum += max;
            max++;
        }

        return sum;
    }
}