class Solution {
    public int solve(int n) {
        //Collatz Sequence with recursion
        int count=1;
        return collatz(n, count);
    }
    
    public int collatz(int n, int count){
        if(n<=1){
            return count;
        }
        
        if(n%2==0){
            count+=collatz(n/2 , count++);
        }else{
            count+=collatz(3*n+1 , count++);
        }
        
        return count;
    }
}