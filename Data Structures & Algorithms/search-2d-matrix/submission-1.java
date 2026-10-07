class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;

        //find correct row
        int top = 0, bottom = n-1;
        int row=0;
        while(top<=bottom){
            row = (top + bottom)/2;

            if(target> matrix[row][m-1])
            {
                top = row + 1;
            }
            else if(target<matrix[row][0])
            {
                bottom = row-1;
            }
            else{
                break;
            }

        }

        if(!(top<=bottom))
            return false;

        int l = 0, r = m-1;

        while(l<=r)
        {
            int mid = l+ (r-l)/2;

            if(target > matrix[row][mid])
            {
                l = mid + 1;
            }else if(target < matrix[row][mid])
            {
                r = mid - 1;
            }
            else return true;
        }

       return false; 
        
    }
}
