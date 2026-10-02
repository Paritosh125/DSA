class Solution {
    class Pair {
        char value;
        int freq;
        Pair(char value,int freq)
        {
            this.value = value;
            this.freq = freq;
        }
    }
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> st = new Stack<>();
        for(int i = 0; i < n ; i++)
        {
            char ch = s.charAt(i);
            if(st.isEmpty())
            {
                st.push(new Pair(ch,1));
            }
           else if(!st.isEmpty() && ch != st.peek().value)
            {
                st.push(new Pair(ch,1));
            }
            //  else if(!st.isEmpty() && ch == st.peek().value)
            else 
            {
                // st.peek().freq = st.peek().freq + 1;
                st.peek().freq++;
                if(st.peek().freq == k)
                st.pop();

            }

        }
        StringBuilder sb = new StringBuilder();

for (Pair p : st) {
    for (int i = 0; i < p.freq; i++) {
        sb.append(p.value);
    }
}
 String res = sb.toString();
    return res ; 
        
    }
}