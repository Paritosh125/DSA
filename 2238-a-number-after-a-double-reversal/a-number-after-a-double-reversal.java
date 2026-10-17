class Solution {
    public int reverseNum(int num)
    {
        StringBuilder sb = new StringBuilder("");
        while(num > 0)
        {
            int rem = num % 10 ;
            num = num/10;
          
            sb.append(rem);
           
        }
        String s = sb.toString();
        int res = Integer.parseInt(s);
        return res;
    }
    public boolean isSameAfterReversals(int num) {
        if(num == 0)
        return true;
        int copy = num ; 
        int rev1 = reverseNum(copy);
        int rev2 = reverseNum(rev1);

        if(rev2 == num)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}