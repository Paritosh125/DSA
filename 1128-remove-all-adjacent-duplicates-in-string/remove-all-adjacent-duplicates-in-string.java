class Solution {
    public String removeDuplicates(String s) {
         if (s == null || s.length() == 0) {
            return "";
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for(int i = 1; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == ch)
            {
                stack.pop();
            }
            else
            {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
    
        for (char ch : stack) {
            sb.append(ch);
        }

        String result = sb.toString();
        return result;
        
    }
}