class Solution {
    public boolean isPalindrome(int x) {
      String s = Integer.toString(x);
      int n = s.length();
      for(int i = 0 ; i < n ; i++)
      {
        int left = s.charAt(i);
        int right = s.charAt(n-1-i);
        if(left != right)
        return false;
      }
    return true ;
    }
}