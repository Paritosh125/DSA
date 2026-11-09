class Solution {
    public int findFibo(int n)
    {
        if(n<=1)
        return n;
        else
        return findFibo(n-1) + findFibo(n-2);
    }
    public int fib(int n) {
        int res = findFibo(n);
        return res;
    }
}