import java.util.*;

class Solution {
    public int solve(String s) {
        if(s==null || s.length()==0)
            return 0;
        int count =0;
        int aux = 1;
        char c = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(c==s.charAt(i)){
                aux++;
            }else{
                if(count<aux){
                    count = aux;
                }
                aux = 1;
                c=s.charAt(i);
            }
        }return Math.max(count,aux);
    }
}