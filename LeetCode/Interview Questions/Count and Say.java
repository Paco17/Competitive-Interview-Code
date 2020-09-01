class Solution {
    public String countAndSay(int n) {
        String str = "1";
        n--;
        while(n>0){
            StringBuilder builder = new StringBuilder();
            char[] array = str.toCharArray();
            int count = 1;
            for(int i=0;i<array.length;i++){
                //Cuando va a parar
                if(i==array.length-1||array[i]!=array[i+1]){
                    builder.append(""+count+array[i]);
                    count=1;
                }else{
                    count++;
                }
            }n--;
            str = builder.toString();
        }return str;
    }
}