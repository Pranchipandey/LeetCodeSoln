class Solution {
    public String reverseWords(String s) {
         String[] revstr = s.split(" ");
        String out = "";
        
        for(int i = revstr.length-1; i >= 0; i--) {
            
            if(revstr[i]!="") out += revstr[i]+" ";
        
        }
        
        out = out.trim();
    return out;
    }
}