/*Given two strings s1 and s2 consisting of only ones and zeros, return a string representing the sum of s1 and s2 when they are considered as binary numbers. */

#include <iostream>
#include <string>


using namespace std;

class Solution{
    public: 
        string addBinaryStrings(string s1, string s2){
            string ans ;
            
            int i = s1.size()-1,
                j=s2.size()-1,
                carry = 0;
            while(i>=0 || j>=0){
                int sum = carry; //SUma total de cada iteración
                if(i>=0){
                    sum+= s1[i--] -'0';
                }

                if(j>=0){
                    sum+=s2[j--] -'0';
                }

                ans += to_string(sum%2); 
                carry = sum/2;
               
            }

            if(carry!=0){//carry = 1
                ans+=to_string(carry);
                
            }

            int n = ans.size();
           for(int i=0; i<n/2;i++){
               swap(ans[i], ans[n-i-1]);
           }
                

            return ans; 
        }  
};

int main(){
    string s1 = "101",
           s2= "1";
    Solution solution;
    cout<<solution.addBinaryStrings(s1,s2)<<endl;
    return 0;
}