/*Given a 2D matrix (which is m x n) find the given element with value "value". If the matrix contains the value return true, otherwise return false.*/

#include <iostream>
#include <vector>

using namespace std;

class Solution{
    public:
        bool search(vector<vector<int>>& matrix, int target){
            int i=0;
            int j1=0;
            int j2=matrix[i].size()-1;
            while(i<matrix[i].size()){
                if(target>=matrix[i][j1] && target<=matrix[i][j2]){
                    while(j1<=j2){
                        if(matrix[i][j1]==target)
                            return true;
                        j1++;
                    }
                }else{
                    ++i;
                    j2=matrix[i].size()-1;
                }
            }return false;
        }
};

int main(){
    Solution sol;
    vector<vector<int>> matrix = {{1,4,7,11},{8,9,10,20}, {11,12,17,30}};
    cout<<sol.search(matrix, 20)<<endl;
    return 0;
}