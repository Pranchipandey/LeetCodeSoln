class Solution {
     public static void rev(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        k %= nums.length; 
        if(nums == null || nums.length < 2){
           return;
        }
        rev(nums, 0, nums.length - 1);
        rev(nums, 0, k-1);
        rev(nums, k, nums.length -1);
    }
}