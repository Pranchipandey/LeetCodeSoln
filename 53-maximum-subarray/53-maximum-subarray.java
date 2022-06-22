class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int best=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
          if(sum>best){
              best=sum;
          }
        if(sum<0){
            sum=0;
            }
        }
        return best;
    }
}
/*int sum=0;
int max=nums[0];
for(int i =0;i<nums.length;i++){
sum+=nums[i];
if(sum>max){
max=sum;
}
if(sum<0)sum=0;
}
return max;*/