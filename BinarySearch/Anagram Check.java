
class Solution {
    public boolean solve(String s0, String s1) {
        // Write your code here
        if(s0.length()!=s1.length()){
            return false;
        }
        
        Hashtable<Character, Integer> hash = new Hashtable<>();
        
        for(int i=0;i<s0.length();i++){
            Character chars0= s0.charAt(i);
            Character chars1= s1.charAt(i);
            
            Integer count0 = hash.get(chars0);
            hash.put(chars0,(count0==null)?1:count0+1);
            
            Integer count1 = hash.get(chars1);
            hash.put(chars1,(count1==null)?1:count1+1);
        }
        Set<Character> charact = hash.keySet();
        for(Character key:charact){
            if(hash.get(key)%2>0)
                return false;
        }return true;
    }
}
