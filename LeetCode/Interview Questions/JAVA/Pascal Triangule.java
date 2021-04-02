class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        //Case 0 rows
        if(numRows == 0)
            return result;
        
       List<Integer> before = new ArrayList<Integer> ();
        before.add(1);
        result.add(before);
        
        for(int i =2; i<=numRows; i++){
            List<Integer> current = new ArrayList<Integer>();
            
            current.add(1);
            for(int j=0; j<before.size()-1;j++){
                current.add(before.get(j)+before.get(j+1)); // To index 1 to length()-2;
            }
            current.add(1);
            
            result.add(current);
            before = current;
        }return result;
            
    }
}