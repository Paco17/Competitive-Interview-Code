/*Given an integer value n, enumerate all prime numbers from 1 to n (exclusive) and return the list with the enumeration.*/

#include<iostream>
#include<vector>

using namespace std;

class Solution {
    public: 
        vector<int> enumeratePrimes(int n){
            vector<int> v;

            //Worst case Time Space (O^1.5) Space(n) fro the array
            /*while(i<=n){ O(n)
                int j=2;
                bool isprime = false;
                while(j<i){ //(Osqrt(n))
                    if(i%j == 0)
                        isprime = true;
                    j++;
                }if(!isprime)
                    v.push_back(i);
                    i++;
            }*/
            
            //Using array
            vector<bool> isPrime(n, true);

            isPrime[0] = false;
            isPrime[1] = false;

            //Any number can have factor less than sqrt(n)
            for(int i=2; i*i<=n;i++){
                if(isPrime[i]==true){
                    for(int j=i+i;j<=n;j+=i)
                        isPrime[j]=false;
                }
            }


            //Add the numbers in the vector
            for(int i=2; i<=n;i++){
                if(isPrime[i]==true){
                    v.push_back(i);
                }
            }

            return v;
        }
};

int main(){
    int num = 23;
    Solution sol;
    vector<int> v;
    v = sol.enumeratePrimes(num);

    for(auto &i : v){
        cout<<i<<", ";
    }
    return 0;
}