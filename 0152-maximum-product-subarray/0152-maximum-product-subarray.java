class Solution {
    public int maxProduct(int[] nums) {
        int maxFar=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            int tempMax=Math.max(x,Math.max(currMax*x,currMin*x));
            int tempMin=Math.min(x,Math.min(currMax*x,currMin*x));
            currMax=tempMax;
            currMin=tempMin;
            maxFar=Math.max(maxFar,currMax);
        }
        return maxFar;
    }
}