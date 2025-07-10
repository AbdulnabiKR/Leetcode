class Solution {
    public int hammingWeight(int n) {
        // String binary=Integer.toBinaryString(n);//1011
        // int count=0;
        // for(int ch:binary.toCharArray()){
        //     if(ch=='1')
        //     count++;
        // }
        // return count;
        int count=0;
        while( n>0){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        return count;
    }
}