#include <iostream>
#include <vector>

using namespace std;

int removeDuplicates(vector<int>& nums){
    if(nums.size()==0)
            return 0;
        unsigned int p1 = 0;
        for(int p2 = 1; p2 < nums.size(); p2++){
            if(nums[p1]!=nums[p2]){
                nums[++p1] = nums[p2];
            }
        }
    return p1+1;
}


int main()
{
    vector<int> nums  = {1,2,3,3,4,4,5,5,7};
    cout << removeDuplicates(nums) << "\n";
    return 0;
}
