class Solution {
     public List<Integer> kSmallestElements(int[] elements, int k) {

     	//Brute Force
     	/*Arrays.sort(elements);
    	 List<Integer> lista = new ArrayList<>();
     
     	for(int i=0;i<k; i++){
       	     lista.add(elements[i]);
     	}
     	return lista;
	*/
  
 	//PriorityQueue
  	//Nos preocupamos por los datos primeros a salir; Osea los más pequeños 
 
 	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());
  
  	for(Integer element:elements){
    	     maxHeap.add(element);  
  
    	     if(maxHeap.size()==k+1)
      	           maxHeap.poll();   
        }
  
        List<Integer> smallest = new ArrayList<>(maxHeap);
        return smallest;                
    }
}
