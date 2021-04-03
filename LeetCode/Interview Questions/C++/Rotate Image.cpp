void rotate(vector<vector<int>>& matrix){
    //max & min
    
    if(matrix.size()<=1){return;}
    int min = 0,
        max = matrix.size()-1;
        
    while (min<max){
        //Changes
        int temp = matrix[0][min];
        
        //4th changes
        matrix[0][min] = matrix[max-min][0];
        matrix[max-min][0] = matrix[max][max-min];
        matrix[max][max-min] = matrix[min][max];
        matrix[min][max] = temp;
        
        //Upload
        min++;
        
    }
}