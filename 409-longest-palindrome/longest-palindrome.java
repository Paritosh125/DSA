class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count = 0;
        boolean odd = false;
        for(int freq : map.values())
        {
            if(freq%2 == 0)
            {
                count += freq;
            }
            else
            {
                odd = true;
            }
        }
        if(odd == false)
        return count;
        else
        {
        for(int freq : map.values())
        {
            if(freq % 2 == 1)
            {
                count += freq -1 ;
            }
        }
        return count + 1;
        }
       
    }
}