public class Solution {
    //Mark and Toys Porblem (Easy Problem)

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0;
        for(int i=0;i<prices.length;i++){
            k -=prices[i];
            if(k>=0)
                count++;
            else
                return count;
        }return count;

    }