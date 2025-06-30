class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int low=matrix[0][0];//initializing first element
        int high=matrix[n-1][n-1];//initializing to last element
        while(low<high){
            int mid=low+(high-low)/2;
            //count the elements which is <= to mid so
            int count=countLessEqual(matrix,mid);
            if(count<k)
            low=mid+1;//if count<k then kth element must be after mid only low=mid+1
            else
            high=mid;//if count>=k must be it in before mid so high=mid
        }
        return low;
    }
    public int countLessEqual(int matrix[][],int mid){
        int n=matrix.length;
        int row=n-1;
        int col=0;
        int count=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]<=mid){
            count+=(row+1);//row+1 using ->all the column respectd above it<= mid so
              col++;
            }
            else{
                row--;
            }
        }
        return  count;
    }
}