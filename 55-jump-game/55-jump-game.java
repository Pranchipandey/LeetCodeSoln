class Solution {
    public boolean canJump(int[] nums) {
        int des=0;
       int jump=0;
        if(nums.length==1){
            return true;
        }
        for(int i=0;i<nums.length;i++){
            if(des<i){
                return false;
            }
            des=Math.max(des,nums[i]+i);
           jump++;
        }
        return true;
    }
}