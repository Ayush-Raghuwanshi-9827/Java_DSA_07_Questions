package binarySearchQuestion;
public class MedianInRowWiseSortedMatrix {
// https://www.geeksforgeeks.org/find-median-row-wise-sorted-matrix/#practice
    public static void main(String[] args) {
        int[][] matrix = {
            {1},
            {2},
            {3}
        };
        int ans = median(matrix, 3, 1);
        System.out.println(ans);
    }
    // public static int median(int matrix[][], int R, int C) {
    //     // code here
    //     int total = R * C;
    //     int medianIndex = total / 2;
    //     int start = 1;
    //     int end = 14;
    //     while(start <= end){
    //         int mid = start + (end -start) /2;
    //         int count = Count(matrix, mid);
    //          if (count <= medianIndex) {
    //             start = mid +1;
    //         }else{
    //             end = mid -1;
    //         }
    //     }
    //     return start;
    // }
    // public static int Count(int[][] matrix, int mid){
    //     int count = 0;
    //     for(int i=0; i < matrix.length; i++){
    //         int start = 0;
    //         int end = matrix[i].length -1;  
    //         while(start <= end){
    //             int midt = start + (end - start) /2;
    //             if(matrix[i][midt] <= mid){
    //                 start = midt + 1;
    //             }else {
    //                 end = midt -1;
    //             }
    //         }
    //         count += start;
    //     }
    //     return count;
    // }

    public static int median(int matrix[][], int R, int C) {
        // code here
        int total = R * C;
        int medianIndex = total / 2;
        int start = 1;
        int end = 2000;
        while(start <= end){
            int mid = start + (end -start) /2;
            int count = Count(matrix, mid);
            if(count <= medianIndex){
               start = mid + 1;
            }
            else {
                end = mid -1;
            } 
        }
        return start;
    }
    public static int Count(int[][] matrix , int mid){
        int count = 0;
        for(int i=0; i < matrix.length; i++){
            int start = 0;
            int end = matrix[i].length -1;  
            while(start <= end){
                int midt = start + (end - start) /2;
                if(matrix[i][midt] <= mid){
                    start = midt + 1;
                }else {
                    end = midt -1;
                }
            }
            count += start;
        }
        return count;
    }
}