class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length==0) {
	return 0;
        }
        
        /*Solution without using any Data Structure and only the need of two variables and a count
        * Time: 0(n)
        * Space 0(1)*/
        int count=1;
        int n = 0;

        for(int i=1;i<nums.length;i++){
	if(nums[n]<nums[i]){
	            nums[n+1] = nums[i];
                               count++;
                               n++;  
            }
        }

        return count;		

    }
}