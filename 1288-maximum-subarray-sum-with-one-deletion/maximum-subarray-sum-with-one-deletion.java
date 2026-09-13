class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int prev_nodelete = nodelete ; 
            nodelete = Math.max(nodelete + arr[i],arr[i]);
            onedelete = Math.max(prev_nodelete , onedelete + arr[i]);
            res = Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;
    }
}