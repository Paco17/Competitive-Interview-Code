/*Given an array of n integers, return all unique triplets [a,b,c] in the array such that a + b + c = 0.*/
//Using hashtables and find the complements
#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <algorithm>
#include <iterator>

using namespace std;

class Solution{
    public: 
        vector<vector<int>> threeSum(vector<int>& nums){
            vector<vector<int>> v;
            int n = nums.size();
            set <vector<int>> s; 

            //Using hashtable Time complexity(n) Space Complexity(n)
            map<int, int> numbers;
            
            //target
            //
            
            //Using sorted array
            sort(nums.begin(), nums.end());
            for(int i=0;i<(n-1);i++){
                int begin = i+1,
                    last = n-1,
                    val,
                    target=0;
                while(begin<last){
                    val = nums[i]+nums[begin]+nums[last];
                    if(val==0){
                        s.insert({nums[i], nums[begin], nums[last]});
                        begin++; 
                        last--;
                    }else if(val<target){
                        begin++;
                    }else{
                        last--;
                    }
                } 
            }

            auto it = s.begin();
            while(it!=s.end()){
                v.push_back(*it);
                it++;
            }
           

            return v;

            
            
    }
};

int main(){
    vector<int> array = {-3,-1,1,0,2,10,-2,8};
    Solution sol;
    vector<vector<int>> v;
    v = sol.threeSum(array); 

    for(auto &i:v){
        for(auto &j:i){
            cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}