class Solution {
    public boolean solve(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                int value = map.get(i);
                map.put(i, value + 1);
            }
        }
        
        for(int i : nums){
            if(i == map.get(i))
                return true;
        }return false;
    }
}