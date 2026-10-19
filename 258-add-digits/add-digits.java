class Solution {
    public int numAdded(int num)
    {
        String s = Integer.toString(num);
        int sum = 0;
        if(s.length() == 1)
        {
            return num ;
        }
        else{
            
            while(num > 0)
            {
                int rem = num % 10 ;
                num = num/10 ;
                sum+= rem ; 
            }
        }
        return numAdded(sum);
    }
    public int addDigits(int num) {
        return numAdded(num);
    }
}