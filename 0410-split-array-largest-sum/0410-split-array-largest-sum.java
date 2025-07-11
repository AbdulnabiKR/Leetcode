class Solution {
    public int splitArray(int[] nums, int k) {
     int low=Arrays.stream(nums).max().getAsInt();//low will be max element in array
     int high=0;//total sum of the array so loop there
     for(int num:nums){
        high+=num;    
     }
     int ans=0;
     while(low<=high){
        int mid=low+(high-low)/2;//chcking is this sun poss to split in k with min
        int count=isPossibleSplit(nums,mid);//no of subarrays split poss
        if(count<=k){//find any other min than this so
          ans=mid;
          high=mid-1;
        }
        else{//count > k-> false so 
          low=mid+1;
        }
     }
     return ans;
    }
    public int isPossibleSplit(int nums[],int max){
        int tempCheck=0;
        int count=1;//taking 1 because atleast 1 subarray present& last subarr<max then dont update so taking beginning only 1 
        for(int i=0;i<nums.length;i++){
            if(tempCheck+nums[i]<=max){
                tempCheck+=nums[i];
            }
            else{//tempCheck+nums[i]>max
            count++;
            tempCheck=nums[i];
            }
        }
        return count;
    }
}