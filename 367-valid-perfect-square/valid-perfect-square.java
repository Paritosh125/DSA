class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while(low <= high)
        {
            int guess = low + (high - low)/2;
            long sqr = (long)guess * guess;
            if(sqr == num)
            {
                return true;
            }
            else if(sqr > num)
            {
                high = guess - 1;
            }
            else
            {
                low = guess + 1;
            }

        }
        return false;
    }
}