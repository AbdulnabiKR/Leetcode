class Solution {
    public int myAtoi(String s) {
       int i=0,result=0,sign=1;
       s=s.trim();
       if(i<s.length()){
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+'){
            i++;
        }
       }
       while(i<s.length() && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
        if(result>(Integer.MAX_VALUE-digit)/10){
         return sign==1?(Integer.MAX_VALUE):(Integer.MIN_VALUE);
        }
         result=result*10+digit;
         i++;
       }
       return result*sign;
    }
}