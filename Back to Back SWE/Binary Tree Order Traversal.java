
class Solution {
  public List<List<Integer>> levelOrderTraversal(TreeNode root) {
    if(root == null){
      return new ArrayList<>();
    }
    
    List<List<Integer>> lista  =  new ArrayList<List<Integer>>();
    Queue<TreeNode> cola = new LinkedList<>();
    cola.offer(root);
    
    while(!cola.isEmpty()){
      List<Integer> level = new ArrayList<Integer>();
      int nivel = cola.size();
      for(int i = 0; i<nivel;i++){
        TreeNode tmp = cola.poll();
        
        level.add(tmp.val);
        
        if(tmp.left!=null){
          cola.offer(tmp.left);
        }
        
        if(tmp.right!=null){
          cola.offer(tmp.right);
        }
      }lista.add(level);
    }
    return lista;
  }
}