class Solution {
    public int solve(LLNode node) {
        double num = 0;
        int res = 0;
        int pow = 1;
        while(node!=null){
            num*=10;
            num += node.val;
            node= node.next;
            
        }
        System.out.print(num);
        
        while(num>0){
            if(num%10==1){
                res+=pow;
            }
            num/=10;
            pow+= pow;
        }
        return res;
    }
}