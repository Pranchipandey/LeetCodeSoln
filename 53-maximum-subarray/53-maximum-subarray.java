class Solution {
    public int maxSubArray(int[] nums) {
        int sum =nums[0];
        int max = sum;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]> sum+nums[i]){
            sum = 0;
            }
            max = Math.max(max , sum+nums[i]);
            sum += nums[i];
        }
       return max; 
    }
}