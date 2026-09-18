class Solution {
    public int findMaxLength(int[] nums) {
        int one = 0;
        int zero = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
            zero++;
            else
            one++;
            int diff= zero - one ;
            if(diff == 0)
            res = Math.max(res,i+1);
            if(!map.containsKey(diff)){
            map.put(diff ,i);
            }
            else
            {
             res = Math.max(res, i - map.get(diff));   
            }

        }
        return res;
    }
}