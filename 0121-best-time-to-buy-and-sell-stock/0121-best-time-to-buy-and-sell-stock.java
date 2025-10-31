    class Solution {
        public int maxProfit(int[] prices) {
         int n=prices.length;
         int max_=0;
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         for(int i=0;i<n;i++){
            if(min>prices[i])
               min=prices[i];
               max_=prices[i]-min;
               max=Math.max(max,max_);
         }
         return max;
        }
    }