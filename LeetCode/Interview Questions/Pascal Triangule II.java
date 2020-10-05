class Solution {
    public List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> list =  new ArrayList<>();
            list.add(1);
        if(rowIndex==0){
            return list;
        }
        list.add(1);
        return getRow(1, rowIndex, list);
        
    }
    public ArrayList<Integer> getRow(int currentRow, int rowEnd, ArrayList<Integer> list){
       //Comprobar si es la fila 
        if(currentRow < rowEnd){
            System.out.println("Entro al if");
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for(int i=1; i<list.size();i++){
                System.out.println("For Iteracion: "+i);
                tmp.add(list.get(i)+list.get(i-1));
            }tmp.add(1);
            list = getRow(++currentRow, rowEnd, tmp); 
        }
        return list;
    }
}