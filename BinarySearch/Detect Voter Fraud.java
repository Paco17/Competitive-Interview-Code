class Solution {
    public boolean solve(int[][] votes) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<votes.length;i++){
            if(set.contains(votes[i][1])){
                return true;
            }set.add(votes[i][1]);
        }
        return false;
    }
}