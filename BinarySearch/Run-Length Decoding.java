
class Solution {
    public String solve(String s) {
     if(s.length()==0 || s==null)
        return "";
     String result = "";
     int count=0;
     int num = 0;
     for(int i =0; i<s.length();i++){
         if(s.charAt(i)>47 && s.charAt(i)<58){
             num = num*10+Character.getNumericValue(s.charAt(i));   
         }else{
            char c = s.charAt(i);
            while(num>0){
                result+=""+c;
                num--;
            }   
         }
     }return result;
    }
}