package binarySearchQuestion;

public class SearchIn2DmatrixII {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7,9},
            {2,4,6,8,10},
            {11,13,15,17,19},
            {12,14,16,18,20}
        };
        int target = 11;
        System.out.println(searchMatrix(arr, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i < m; i++){
            if(matrix[i][0] <= target && matrix[i][n-1] >= target){
                int start = 0;
                int end = matrix[i].length -1;
                while(start <= end){
                    int mid = start + (end -start)/2;
                    if(matrix[i][mid] == target){
                        return true;
                    }else if(matrix[i][mid] < target){
                        start = mid + 1;
                    }else {
                        end = mid -1;
                    }
                }
                if(matrix[i][end] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
