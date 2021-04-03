void plusOne(vector<int>& digits){
    if(digits.size()==0){
        digits.insert(digits.begin(), 1);
        return;
    }
    
    int carry = 1;

    for(int i=digits.size()-1; i>=0; i--){
        if(digits[i]<9){
            digits[i]+=carry;
            return;
        }else{
            digits[i]=0;
        }
    }
    
    //If reach the final;
    digits.insert(digits.begin(), 1);
    
   return;
}