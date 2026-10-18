class Solution {
    public int getProduct(int n)
    {
        int prod = 1 ;
        while(n > 0)
        {
            int rem = n % 10 ;
            n = n / 10 ;
            prod = prod * rem ;
        }
        return prod ;
    }
    public int getSum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            n = n/10 ;
            sum+= rem;
        }
        return sum ;
    }
    public int subtractProductAndSum(int n) {
        int product = getProduct(n);
        int sum = getSum(n);
        int diff = product - sum ;
        return diff ;
    }
}