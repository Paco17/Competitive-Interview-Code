class Solution {
    public int firstUniqChar(String s) {
        //Hastable because we need the index value
        if(s.length()==0){
            return -1;
        }
        
        if(s.length()==1){
            return 0;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }else{
                map.put(c,-1);
            }
        }
        
        //Find the minimun index
        int min=Integer.MAX_VALUE;
        for(char c:map.keySet()){
            if(map.get(c)>-1 && map.get(c)<min){
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE?-1:min;
    }
}