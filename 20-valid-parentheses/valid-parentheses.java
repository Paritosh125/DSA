class Solution {
    public boolean isValid(String s) {
        Stack<Character> par = new Stack<>();
        for(char ch : s.toCharArray())
        {
            switch(ch)
            {
                case ')':
                if(!par.isEmpty() && par.peek() == '(')
                {
                par.pop();
                }
                else
                {
                return false;
                }
                break;

                case ']':
                if(!par.isEmpty() && par.peek() == '[')
                par.pop();
                 else
                return false;
                break;

                case '}':
                if(!par.isEmpty() && par.peek() == '{')
                par.pop();
                 else
                return false;
                break;

                default:
                par.push(ch);
                break;
            }
        }
        if(par.isEmpty())
        return true;
        return false;
    }
}