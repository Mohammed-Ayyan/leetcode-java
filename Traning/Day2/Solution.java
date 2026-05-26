package Day2;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int i=0;
        int j=(r*c)-1;
        while(i<=j){
            int mid=(int)(i+j)/2;
            int tr=(int)mid/c;
            int tc=mid%c;
            if(matrix[tr][tc]==target) return true;
            else if(matrix[tr][tc]<target) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
}
