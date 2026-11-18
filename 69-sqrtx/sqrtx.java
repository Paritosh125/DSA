
class Solution {
    public int mySqrt(int x) {
        if(x == 0)
        return 0;

        if(x == 1)
        return 1;

        int ans = -1;
        int low = 1;
        int high = x;

        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long square = (long) mid * mid;

            if(square > x)
            {
                high = mid - 1;
            }
            else if(square == x)
            {
                return mid;
            }
            else
            {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}
