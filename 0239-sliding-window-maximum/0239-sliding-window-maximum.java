class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||k<=0) return new int[0];
        int n=nums.length;
        int result[]=new int[n-k+1];
        Deque<Integer>dq=new LinkedList<>();//add/delete from both front and rear using ll bec easy to add or delete so
        for(int i=0;i<n;i++){
            //s-1
            if(!dq.isEmpty() && dq.peekFirst()<i-k+1){//if ele exist from out window removing it
               dq.pollFirst();//removing in beginning
            }
            //s-2
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){//removing smaller ele and placing large ele in beginning
            dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                result[i-k+1]=nums[dq.peekFirst()];
            }
        }
        return result;
    }
}