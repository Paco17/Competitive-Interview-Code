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
           int m = matrix.size(),
               n = matrix[0].size();

            bool firstRow = false, 
                firstColumn = false;
            
            for(int j= 0; j<n; ++j){
                if(matrix[0][j] == 0){
                    firstRow =true;
                    break;
                }
            }
            

            for(int i= 0; i<m; ++i){
                if(matrix[i][0] == 0){
                    firstColumn =true;
                    break;
                }
            }
            
            for(int i=1;i<m;++i){
                for(int j = 1;j<n;++j){
                    if(matrix[i][j]==0){
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
                
            

            for(int i=1; i<m; ++i){
                for(int j=1;j<n;++j){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] =0;
                    }
                }
            }
                
            

             if(firstRow){
                for(int j=0;j<n;++j){
                    matrix [0][j] =0;
                }
             } 

            if(firstColumn){
                for(int i=0;i<m;++i){
                    matrix [i][0] =0;
                }
            }

            /* Another better solution
                int m=A.size(), n=A[0].size();
                bool r1=false;
                for(int j=0;j<n;j++)
                    if(A[0][j]==0) {
                        r1=true;break;
                    }
                for(int i=1;i<m;++i) {
                    bool flag=false;
                    for(int j=0;j<n;++j) {
                        if(A[i][j]==0) {
                            A[0][j]=0;
                            flag=true;
                        }
                    }

                    if(flag) {
                        A.insert(A.begin()+i, vector<int>(n,0));
                        A.erase(A.begin()+i+1);
                    }
                }

                for(int j=0;j<n;j++) {
                    if(A[0][j]==0)
                        for(int i=1;i<m;++i)
                            A[i][j]=0;
                }

                if(r1) {
                    A.insert(A.begin(), vector<int>(n,0));
                    A.erase(A.begin()+1);
                }

            */
                
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