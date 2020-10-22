import java.util.*;

class Solution {
    public int[] solve(int[] nums) {
        int carry = 1;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i]+carry>=10){
                nums[i] = 0;
                carry= 1;
            }else{
                nums[i]+=carry;
                carry = 0;
            }
        }if(carry>0){
            int[] retorno = new int[nums.length+1];
            retorno[0] = carry;
            for(int i=1; i<retorno.length;i++){
                retorno[i] = nums[i-1];
            }return retorno;
        }else{
            return nums;
        }
    }