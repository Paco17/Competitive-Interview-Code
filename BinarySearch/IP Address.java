import java.util.*;

class Solution {
    public boolean solve(String s) {
        String[] array = s.split("\\.");
        if(array.length != 4)
            return false;
        
        for(int i=0;i<array.length;i++){
            if((array[i].charAt(0)=='0' && array[i].length()>1) || (int)array[i].charAt(0)<48){
                return false;
            }
            try{
                int n = Integer.parseInt(array[i]);
                if(n<0 || n>255)
                    return false;
            }catch(NumberFormatException e){
                return false;
            }
        }return true;
    }
}