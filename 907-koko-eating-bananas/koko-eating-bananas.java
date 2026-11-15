
class Solution {
    public long getTotal(int[] arr, int target)
    {
        long sum = 0;

        for(int i : arr)
        {
            int count = (i - 1) / target + 1;
            sum += count;
        }

        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int maxEle = piles[0];

        for(int i = 1; i < n; i++)
        {
            maxEle = Math.max(maxEle, piles[i]);
        }

        int low = 1;
        int high = maxEle;
        int ans = -1;

        while(low <= high)
        {
            int guess = low + (high - low) / 2;
            long total = getTotal(piles, guess);

            if(total <= h)
            {
                ans = guess;
                high = guess - 1;
            }
            else
            {
                low = guess + 1;
            }
        }

        return ans;
    }
}
