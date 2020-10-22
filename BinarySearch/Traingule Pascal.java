import java.util.*;

class Solution {
    public int[] solve(int n) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        n--;
        while(n>=0){  
            ArrayList<Integer> aux = new ArrayList<>();
            for(int i  = 0; i<array.size()+1;i++){
                if(i==0 || i==array.size()){
                    aux.add(1);
                }else{
                    aux.add(array.get(i-1)+array.get(i));
                }       
            }n--;
            array = aux;
        }
        int[] res = new int[array.size()];
        for(int i=0; i<array.size();i++)
            res[i] = array.get(i); 
        return res;
    }
}