class Solution {
    public boolean solve(String s) {
        Set<Character> set = new HashSet<>();
        for(Character c:s.toCharArray()){
            if(set.contains(c)){
                return false;
            }set.add(c);
        }return true;
    }
}