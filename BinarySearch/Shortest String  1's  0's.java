class Solution {
    public int solve(String s) {
        /*Brute Force*/
        int begin = 0;
        for(int last = 1; last<s.length();){
            if(s.charAt(begin)!=s.charAt(last)){
                s = s.substring(0,begin)+s.substring(last+1,s.length());
                begin = 0;
                last = 1;
               
            }
            else{
                begin++;
                last++;
            }
        } 
        return s.length();  
        
        /* Best Solution
            Time:(n)
            Space = (1)*/
        
        int zeros = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }

        int ones = s.length() - zeros;
        return Math.abs(ones - zeros);
    }
}