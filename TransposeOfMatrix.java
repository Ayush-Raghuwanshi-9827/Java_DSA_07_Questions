package binarySearchQuestion;
// https://www.geeksforgeeks.org/problems/transpose-of-matrix-1587115621/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab

import java.util.Arrays;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1,1},
            {2,2,2,2},
            {3,3,3,3},
            {4,4,4,4}
        };
        int n = arr.length;
        transpose(n, arr);
        for(int i= 0; i < n; i++){
            System.out.println(Arrays.toString(arr[i]))
            ;
        }
    }
    public static void transpose(int n,int a[][])
    {
        int m = a.length;
        for(int i=0; i < m; i++){
            for(int j=i+1; j  < m; j++){
                swap(a,i, j);
            }
        }
    }
    public static void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
