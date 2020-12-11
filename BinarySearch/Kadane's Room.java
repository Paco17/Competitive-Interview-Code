import java.util.*;

class Solution {
    public int solve(int n) {
        //Integer is 2 to the 31-1
        
        //MySolution
        int pow = 31;
        int cont=0;
        int contGlobal=0;
        while(n>0){
            double numero = Math.pow(2,pow);
            if(numero<=n){
                System.out.println(numero);
                n-=numero;
                cont++;
                if(contGlobal<cont){
                    contGlobal=cont;
                }
            }else
                cont = 0;
            
            pow--;
        }
        
        return contGlobal;
    
        
    }
    
    
}