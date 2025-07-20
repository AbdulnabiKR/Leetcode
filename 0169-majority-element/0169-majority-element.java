class Solution {
    public int majorityElement(int[] nums) {
      Arrays.sort(nums);
      int n=nums.length;
      int half=n/2;
      int maxCount=1;
      int count=1;
      int ans=0;
      if(n==1){
        return nums[0];
      }
      for(int i=1;i<n;i++){
        if(nums[i]==nums[i-1]){
            count++;
        }
        else{
            count=1;
        }
        if(count>maxCount){
            maxCount=count;
            ans=nums[i];
        }
        if(maxCount>half)
         break;
      } 
      return ans;
    }
}