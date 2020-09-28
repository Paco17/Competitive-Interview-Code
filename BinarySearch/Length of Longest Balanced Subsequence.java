class Solution {
    public int solve(String s) {
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for(Character c:s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else{
                if(!stack.isEmpty() && stack.pop() == '('){
                    num+=2;
                }
            }
        }return num;
    }
}