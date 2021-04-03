void moveZeroes(vector<int>& nums){
    int countZeros = 0;
    for(int i=0;i<nums.size();i++){
        if(nums[i]==0){
            countZeros++;
        }else if (nums[i]!=0 && countZeros>0){
            nums[i-countZeros] = nums[i];
            nums[i] = 0;
        }
    }
}