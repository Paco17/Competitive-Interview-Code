class Solution {
    public boolean isValid(String s) {
        //Usando Stacks
        Stack<Character> pila = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            //Switch
            switch(c){
                case '(':
                    pila.push(c);
                    break;
                
                case '[':
                    pila.push(c);
                    break;
                    
                case '{':
                    pila.push(c);
                    break;
                    
                case ')':
                    if(pila.isEmpty() || pila.peek()!='(')
                            return false;
                    pila.pop();
                    break;
                    
                case ']':
                    if(pila.isEmpty() || pila.peek()!='[')
                            return false;
                        pila.pop();
                    break;
                    
                case '}':
                    if(pila.isEmpty() || pila.peek()!='{')
                            return false;
                        pila.pop();
                    break;
                
            }
        }
        if(pila.isEmpty())
            return true;
        return false;
    }
}