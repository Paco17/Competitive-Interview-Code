#include<iostream>
#include <vector>
#include <set>

using namespace std;

class Solution{
    public:
        void setZeroes(vector<vector<int>>& matrix){
            if(matrix.size()== 0 || matrix[0].size()==0){
                return;
            }
           //Constant space

           const int H = matrix.size();
           const int W = matrix[0].size();

           //vector<bool> row_zero(H);
           //vector<bool> column_zero(W);

            bool first_row_zero = false;


           for(int col=0;col<W;++col){
                if(matrix[0][col] == 0){
                       //row_zero[row] = true;
                       //column_zero[col] = true;
                       first_row_zero = true;
                }
            }

           for(int row=0; row <H;++row){
               for(int col = 0;col<W;++col){
                   if(matrix[row][col] == 0){
                       matrix[0][col] = 0;  //Primera fila en su columna
                   }
               }
           }

           for(int row=1;row<H;++row){
               bool contains_zero = false;
               for(int col= 0; col<W;++col){
                   if(matrix[row][col] == 0){
                       contains_zero = true;
                       break;
                   }
               }
                for(int col=0;col<W;++col){
                    cout<<"col: "<<col<<endl;
                    if(contains_zero || matrix[0][col]==0){
                        matrix[row][col] = 0; //Pone en cero a la fila y columna
                    }
                }
           }

           if(first_row_zero){
               for(int col=0;col<W;++col){
                   matrix[0][col]=0;
               }
           }
                
            for(auto &i:matrix){
                for(auto &j:i){
                    cout<<j<<" ";
                }cout<<endl;
            }
        }
};

int main(){
    Solution sol;

    vector<vector<int>> matrix= {{1,1,1},{1,0,1},{1,1,1}};
    sol.setZeroes(matrix);
    return 0;
}