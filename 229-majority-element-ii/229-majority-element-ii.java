class Solution {
    public List<Integer> majorityElement(int[] nums) {
         ArrayList res= new ArrayList<>();
        Arrays.sort(nums);
      
         int count=0;
        for(int i =0;i<nums.length;i+=count){
           count =0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==nums[i]){
                   
                    count++;
                }
            }
            if(count>(nums.length)/3){
                res.add(nums[i]);
                
        
                
            }
           
        }  
        
        return res;
            
    }
}