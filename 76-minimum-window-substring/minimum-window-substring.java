class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        for(char ch : t.toCharArray())
        {
            freq[ch]++;
        }
        int count = t.length();

        int l = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for(int r = 0; r < s.length(); r++)
        {
            char ch = s.charAt(r);

            if(freq[ch] > 0)
            {
                count--;
            }
            freq[ch]--;

            while(count == 0)
            {
                if(r-l+1 < minLen)
                {
                    minLen = r-l+1;
                    start = l;
                }
                char leftChar = s.charAt(l);

                freq[leftChar]++;
                if(freq[leftChar] > 0 )
                {
                    count++;
                }
                l++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? "" : s.substring(start,start + minLen);
    }
}