class Solution {
    public int reverse(int x) {
     
        //Mathematical Solution
        boolean signo = (x>=0)?true:false;
        x = (!signo)?x*-1:x;
        
        long res = 0;
        while(x%10>0 || x>0){
            res *= 10;
            res += (x%10); 
            x /=10;
        }
        
        if(res>Integer.MAX_VALUE)
            return 0;
        
        res = (!signo)?res*-1:res;
        return (int)res;
    }
}