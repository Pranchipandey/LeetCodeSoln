class Solution {
    public int search(int[] nums,int target){
        int s=0;
        int e= nums.length-1;
        int result=Binary(nums,target,s,e);
        return result;
    }
    public int Binary(int[] nums, int target,int s,int e) {
        if(s>e){
            return -1;
        }
        int m= s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(target<nums[m]){
            return Binary(nums,target,s,m-1);
        }
        return Binary(nums,target,m+1,e);
    }
}