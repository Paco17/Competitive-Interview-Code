import java.util.*;

class Solution {
    public int solve(int n) {
        int beer = n;
        while(n>=3){
            n-=2;
            beer+=1;
        }
        return beer;
    }
}