class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0,sum = 0;
        map.put(0,1);
        for(int i : nums)
        {
            sum += i;
            int rem = sum % k;
            if(rem<0)
            {
                rem = rem + k;
            }
            count += map.getOrDefault(rem,0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}