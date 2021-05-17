/*Given an integer n, compute the square root of n, rounded down to the nearest integer.*/

#include <iostream>
#include<math.h>

using namespace std;

class Solution{
    public: 
        int squareRoot(int n){
            int ans = 0;
            int left=1;
            int right = n;
            while(right>=left){
                long int middle = left + (right-left)/2; //Prevent integer overflow
                if(pow(middle,2)<=n){
                    ans = middle;
                    left = ++middle;
                }else{
                    right = --middle;
                }
            }return ans;
        }
};

int main(){
    Solution sol;
    cout<<sol.squareRoot(25);
    return 0;
}