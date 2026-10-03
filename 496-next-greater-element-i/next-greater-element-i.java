class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer> stack = new Stack<>();
       int n = nums2.length;
       HashMap<Integer,Integer> map = new HashMap<>();
        map.put(n-1,-1);
       stack.push(nums2[n-1]);
       for(int i = n-2 ; i>=0 ; i--)
       {
        while(!stack.isEmpty() && stack.peek() <= nums2[i])
        {
            stack.pop();
        }
        if(!stack.isEmpty())
        {
            map.put(nums2[i],stack.peek());
        }   
        else
        {
            map.put(nums2[i],-1);
        }
        stack.push(nums2[i]);

       }
        int[] ans = new int[nums1.length];
       for(int i = 0 ; i < nums1.length;i++)
       {
        if(map.containsKey(nums1[i]))
        {
            ans[i] = map.get(nums1[i]);
        }
        else
        {
            ans[i] = -1;
        }
       }
       return ans ;
    }
}