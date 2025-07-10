class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;//minimum distance possible
        int high=position[position.length-1];//max distance possible by taking lar ele
        int optimal=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPlacementPoss(position,m,mid)){
             optimal=mid;
             low=mid+1;//true even check any min max distance possible so low=mid+1
            }
            else{
                //false placing all m balls is not posible then
                high=mid-1;
            }
        }
        return optimal;
    }
        public boolean isPlacementPoss(int position[],int m,int max){
            int count=1;
            int last=position[0];
            for(int i=0;i<position.length;i++){
                if(position[i]-last>=max){
                    last=position[i];
                    count++;
                }
            }
            return count>=m;
        }
}