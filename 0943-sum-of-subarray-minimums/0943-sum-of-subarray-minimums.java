class Solution {
    public int sumSubarrayMins(int[] arr) {
     int mod=(int)1e9+7;//1*10^9+7->which is the largest prime number which casted into int from double helps to avodi overflow in large arrays
     long sum=0;
     Stack<Integer>st=new Stack<>();
     int n=arr.length;
     for(int i=0;i<=n;i++){
        int currEle=(i==n)?0:arr[i]; //(i==n)?0 bec to ensure whole stack processed
        //1.currEle<arr[st.peek] then find the min of the prev ele
        while(!st.isEmpty() && currEle<arr[st.peek()]){
            int mid=st.pop();
            int left=st.isEmpty()?-1:st.peek();
            int right=i;
            long count=(mid-left)*(right-mid); //count arr[mid] prese as  min in how many subarrays
            sum=(sum+(arr[mid]*count)%mod)%mod;
        }
        //2.st is empty or currEle>=arr[st.peek()]
        st.push(i);
     }
      return (int)sum;
    }
}