class Solution {
    public int solve(LLNode node) {
        // Write your code here
        //Return value;
        
        //Time (n+n)
        //Space(n)
            /*if(node==null){
                return 0;
            }
            
            int cont = 0;
            LLNode second = node.next;
            while(node!=null){
                cont++;
                node = node.next;
            }
            cont/=2;
            while(cont>1){
                cont--;
                second = second.next;
            }
            
            return second.val;*/
        
        //In one pass
        //Time(n)
        //Space(n)
        if(node==null){
            return 0;
        }
        
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        int cont = 0;
        while(node!=null){
            hash.put(cont, node.val);
            cont++;
            node = node.next;
        }
        System.out.print(cont);
        return hash.get(cont/2);
        
        //Using 2 linkedList
        //Time (n)
        //Space()
        LLNode second = node;
        LLNode first = node;
        while(first!=null || first.next!=null){
            first = first.next.next;
            second = second.next;
        }
        
        return second.val;
    }
}
