class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(String item : operations)
        {
                switch(item)
                {
                    case "+":
                    int a = stack.pop();
                    int b = stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                    sum += stack.peek();
                    break;

                    case "D":
                    stack.push(stack.peek() * 2);
                    sum += stack.peek();
                    break;

                    case "C":
                    int remove = stack.pop();
                     sum -= remove;
                    
                    break;

                    default:
                    stack.push(Integer.parseInt(item));
                    sum += stack.peek();
                }
            }    
        
        return sum;
    }
}