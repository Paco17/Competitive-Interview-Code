/*Given a string s, determine whether s is a palindrome while only considering alphanumeric characters and ignoring case.*/

#include <iostream>
#include <string>

using namespace std;

class Solution {
    public:
        bool validPalindrome(string s){

            for(int i = 0; i<s.size();i++){
                if(!isalnum(s[i]) || s.at(i)== ' '){
                    s.erase(i--,1);
                }

                s[i] = tolower(s.at(i));
            }

            cout<<s<<endl;
            int begin = 0, 
                end = s.size()-1;
            while(begin<=end){
                if(s.at(begin)!=s.at(end)){
                    return false;
                }
                cout<<s.at(begin)<<","<<s.at(end)<<endl;
                begin++;
                end--;
            }return true;
        }
        
};

int main(){
    string s = "Mad, ref,er,daM";
    Solution solution;
    cout<< solution.validPalindrome(s)<<endl;
    return 0;
}