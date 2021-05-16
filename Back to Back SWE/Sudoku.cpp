#include <iostream>
#include <vector>
#include <bitset>


//Preguntar el error a jorgito

using namespace std;

class Solution {
    public: 
        bool validSudoku(vector<vector<int>>& sudoku){
            for(auto &i:sudoku){
                for(auto &j:i){
                    cout<<j<<" ";
                }cout<<endl;
            }

            bitset<9> rows[9], col[9], boxes[9];
            for(int i=0; i<9; ++i){
                for(int j=0; j<9; ++j){
                    if(sudoku[i][j]!=0){
                        if(rows[i][sudoku[i][j]]){
                            return false;
                        }
                        rows[i][sudoku[i][j]] = true;

                        if(col[j][sudoku[i][j]])
                            return false;
                        col[j][sudoku[i][j]] = true;

                        int boxnum = 3*(j/3)+i/3;
                        if(boxes[boxnum][sudoku[i][j]])
                            return false;
                        boxes[boxnum][sudoku[i][j]]= true;
                    }
                }
            }

            return true;
        }
};

int main(){
    vector<vector<int>> matrix = {{5,3,0,0,7,0,0,0,0},
                                  {6,5,0,1,9,5,0,0,0},
                                  {0,9,8,0,0,0,0,6,0},
                                  {8,0,0,0,6,0,0,0,3},
                                  {4,0,0,8,0,3,0,0,1},
                                  {7,0,0,0,2,0,0,0,6},
                                  {0,6,0,0,0,0,2,8,0},
                                  {0,0,0,4,1,9,0,0,5},
                                  {0,0,0,0,8,0,0,7,9}};
    Solution sol;
    cout<<sol.validSudoku(matrix);
    return 0;
}