public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int leftRotations = d%size; //leftRotations < size of array
        System.out.println(leftRotations);
        //Caso left 0
        if(leftRotations==0)
            return a;
        else{
            int [] newArray = new int[size];
            int i = 0;
            int begin = size-leftRotations;
            while(i<size){
                newArray[begin++] = a[i++];
                begin = (begin>size-1)? 0: begin;
                
                
            }
            
            return newArray;
        }
    }