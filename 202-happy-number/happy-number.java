class Solution {
     public static int getSumOfSquareOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;       
            sum += (digit * digit);       
            number = number / 10;        
        }
        return sum;
    }


    public boolean isHappy(int n) {
        int slow = 0;
        int fast = 0 ;
        slow = n;
        fast = n;
        while(true)
        {
            slow = getSumOfSquareOfDigits(slow);
            fast = getSumOfSquareOfDigits(fast);
            fast = getSumOfSquareOfDigits(fast);
            if(fast == 1) return true;
            if(slow == fast) return false ; 
        }
        
    }
}