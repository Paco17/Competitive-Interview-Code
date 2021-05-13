/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.*/

#include <iostream>
#include<vector>
#include<climits>

using namespace std;

class Solution{
    public:
        bool increasingTriplet(vector<int>& nums){
            //i<j<k
            //find the minus
            if(nums.size()<=2){
                return false;
            }

            int i = INT_MAX,
                j = INT_MAX, 
                index=0;

            while(index<nums.size()){
                if(nums[index]<=i){
                    i = nums[index];
                }else if(nums[index]<=j){
                    j= nums[index];
                }else{
                    return true;
                }
                index++;
            }

           return false;
        }
};

int main(){
    vector<int> v = {1,2,3,4,5};
    Solution solution;
    cout<<solution.increasingTriplet(v)<<endl;
    return 0;
}