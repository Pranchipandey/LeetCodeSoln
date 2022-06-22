class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
        Arrays.sort(nums2);
       int i=0;
        int j=0;
        int k=0;
     
        while((i<nums1.length)  && (j<nums2.length)){
            if(nums1[i]==nums2[j]){
              nums1[k++]=nums1[i];
                i++;
                j++;
             
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
         int ans[]=new int[k];
        for(i=0;i<k;i++){
            ans[i]=nums1[i];
        }
        return ans;  
     
         
    }
}
