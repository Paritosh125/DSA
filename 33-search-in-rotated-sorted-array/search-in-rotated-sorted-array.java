
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int guess = low + (high - low) / 2;

            if (nums[guess] == target) {
                return guess;
            }

            // Part 1: guess is in the left, larger section
            if (nums[guess] > nums[nums.length - 1]) {

                if (target > nums[nums.length - 1]
                        && target < nums[guess]) {
                    high = guess - 1;
                } else {
                    low = guess + 1;
                }
            }

            // Part 2: guess is in the right, smaller section
            else {
                if (target <= nums[nums.length - 1]
                        && target > nums[guess]) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            }
        }

        return -1;
    }
}
