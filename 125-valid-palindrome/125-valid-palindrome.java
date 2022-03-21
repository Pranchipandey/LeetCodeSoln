class Solution {
    public boolean isPalindrome(String s) {
         if(s == null || s.length() == 0)
            return true;
        
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").strip();
        char[] arr = s.toCharArray();
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                return false;
            }
            start++;
            end--;
        }
        
    return true;
    }
}