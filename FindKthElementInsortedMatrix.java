package binarySearchQuestion;
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

public class FindKthElementInsortedMatrix {
      public static void main(String[] args) {
        int[][] arr = {
            {1,5,9},
            {10,11,13},
            {12,13,15}
        };
        int k = 8;
        System.out.println(kthSmallest(arr, k));
        
      } 

      public static int kthSmallest(int[][] matrix, int k) {
        int R = matrix.length;
        int C = matrix[0].length;
        int start = matrix[0][0];
        int end = matrix[R-1][C-1];
        while(start <= end){
            int assumedmid = start + (end -start)/2;
            int count = findSmallerElement(matrix, assumedmid);
            if(count <= k-1){
                start = assumedmid + 1;
            }else{
                end = assumedmid -1;
            }
        }
        return start;
    }
    public static int findSmallerElement(int[][] matrix, int assumedmid){
        int count = 0;
        for(int i=0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(matrix[i][mid] <= assumedmid){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }
            count += start;
        }
        return count;
    }
}
