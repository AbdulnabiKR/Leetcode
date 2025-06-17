class Solution {
    public int[] plusOne(int[] digits) {
       int n=digits.length;
       for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]=digits[i]+1;
            return digits;
        }
        digits[i]=0;//if digits[i] is 9 hen set 0 amd 1 carry is there
       }
       int newDigit[]=new int[n+1];
       newDigit[0]=1;
       return newDigit;
    }
}