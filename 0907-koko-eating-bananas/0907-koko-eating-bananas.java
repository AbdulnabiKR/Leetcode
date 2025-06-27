class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int minspeed=1;
       int maxspeed=Arrays.stream(piles).max().getAsInt();//gives maximum value in an array
       while(minspeed<maxspeed){
        int mid=minspeed+(maxspeed-minspeed)/2;
        if(canFixed(piles,h,mid))
         maxspeed=mid;
         else
          minspeed=mid+1;
       }
       
       return minspeed;
    }
   public boolean canFixed(int piles[],int h,int speed){
    int hours=0;
    for(int num:piles){
        hours+=(int)Math.ceil((double)num/speed);
    }
    return hours<=h;
   }
}