class Solution {
    public int[] solve(int[] nums, int k) {
        // Write your code  ere
        if(k==0 || nums.length<=1|| k==nums.length)
            return nums;
        //Algorithm Time(n) Space(n)
        /*int[] array = new int[nums.length];
        int i=0;
        k %= nums.length; 
        while(i<array.length){
            if(k>=nums.length){
                k=0;
            }
            array[i++] = nums[k++];
        } 
        return array;*/
        
        //Algorithm Time(n) Space(1) Doing swaps
        k%= nums.length;
        int i=k;
        int cont = 0;
        while(cont<nums.length){
            //Swap
            int tmp = nums[i];
            nums[i] = nums[i-k];
            nums[i-k] = tmp;
            i++;
            cont++;
        }
        
        if(nums.length%2>0 && k%2 == 0){
            int tmp = nums[nums.length-1];
            nums[nums.length-1] = nums[nums.length-2];
            nums[nums.length-2] = tmp;
        }
        
        return nums;
        
    }
}