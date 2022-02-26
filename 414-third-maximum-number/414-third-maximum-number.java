class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i])
                nums[++j] = nums[i];
        }
   
        if(j >= 2) return nums[j - 2];
        else return nums[j];
    }
}