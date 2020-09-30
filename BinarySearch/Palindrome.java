class Solution {
    public boolean solve(String s) {
        //Without recursion
        if(s.length()==1)
            return true;
        int begin =0, last = s.length()-1;
        while(begin<last){
            if(s.charAt(begin++)!=s.charAt(last--))
                return false;
        }return true;
    }
}