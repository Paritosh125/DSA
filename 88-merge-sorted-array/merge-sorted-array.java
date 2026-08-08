class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int id=0;
        int i=0;
        int j=0;

        int[] temp = new int[m];

       for(int k=0; k<m; k++){
        temp[k] = nums1[k];
        }

       while(i<m && j<n)
       {
        if(temp[i] < nums2[j])
        {
            nums1[id] = temp[i];
            i++;
            id++;
        }
        else{
            nums1[id] = nums2[j];
            id++;
            j++; 
        }
       }
        while(i<m)
        {
            nums1[id++] = temp[i++];
        }
        while(j<n)
        {
            nums1[id++] = nums2[j++];
        }
    }
}