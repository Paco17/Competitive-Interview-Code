#include <iostream>
#include<vector>

using namespace std;


class Solution {
  public: 
    vector<vector<int>> rotate(vector<vector<int>>& matrix){
        //Best case 1 space
        if(matrix.size()<=1){
            return matrix;
        }

        //Challengue do the rotation in place

        //First approach so a second matrix Time O(n2) Space(n2)
        /*vector<int> v(matrix.size());
        vector<vector<int>> tmp(matrix.size(), v);

        for(int i=0; i<matrix.size();i++){
            for(int j=0; j<matrix[i].size();j++){
                tmp[j][matrix.size()-i-1] = matrix[i][j];
            }
        }*/

        //Rotation in place corners


        int last = matrix.size()-1;
    
        for(int layer=0;layer<(matrix.size()/2);layer++){
            for(int i = layer; i<last-layer;i++){
                int c1 = matrix[layer][i];
                int c2 = matrix[i][last-layer];
                int c3 = matrix[last-layer][last-i];
                int c4 = matrix[last-i][layer];



                matrix[layer][i] = c4;
                matrix[i][last-layer] = c1;
                matrix[last-layer][last-i] = c2;
                matrix[last-i][layer] = c3;
            }

        }


         for(auto &i : matrix){
            for(auto &j:i){
                cout << j << " ";
            }cout<<endl;
        }

        return matrix;
    }
};

int main(){
    vector<vector<int>> matrix;
    vector<vector<int>> matrix2;
    vector<vector<int>> matrix3;
    Solution sol; 

    matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
     matrix3 = {{10,20},{30,40}};

   sol.rotate(matrix);
    
}

