class Solution {
    public int scoreOfString(String s) {
       ArrayList<Integer> arr = new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            int i = ch;
            arr.add(i);
        }
        int a = arr.get(0);
        int res = 0;
        for(int i = 1 ; i < arr.size() ; i++)
        {
            int b = arr.get(i);
            res += Math.abs(a - b);
            a = arr.get(i);
        }
        return res;
    }
}