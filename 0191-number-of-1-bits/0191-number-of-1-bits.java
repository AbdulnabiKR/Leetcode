class Solution {
    public int hammingWeight(int n) {
        String binary=Integer.toBinaryString(n);//1011
        int count=0;
        for(int ch:binary.toCharArray()){
            if(ch=='1')
            count++;
        }
        return count;
    }
}