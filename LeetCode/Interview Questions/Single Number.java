class Solution {
    public int singleNumber(int[] number) {
        
        /*Using a HashSet
        Set<Integer> set =  new HashSet();
        for(int n:number){
            if(!set.contains(n))
                set.add(n);
            else
                set.remove(n);
        }

        Integer n = set.iterator.next();
        return n;*/
        
        //Bit Manipulation
        int res=0;
        for(int i : number)
            res = res^i;
         return res;
        
        }
}