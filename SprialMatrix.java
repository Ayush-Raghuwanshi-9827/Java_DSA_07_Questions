package binarySearchQuestion;
// https://leetcode.com/problems/spiral-matrix/submissions/1184094386/
import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {

    public static void main(String[] args) {
        int[][] arr= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
            {26,27,28,29,30}
        };
        List<Integer> SprialList = sprialMatrix(arr);
        
        for(int i=0; i < arr.length * arr[0].length; i++){
            System.out.println(SprialList.indexOf(i));
        }
    }
    public static List<Integer> sprialMatrix(int[][] matrix){
         List<Integer> ans=new ArrayList<>();
        int m=matrix.length; //row
        int n=matrix[0].length; //column

        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;


        while(top<=bottom && left<=right){
        //left to rigth
        for(int i=left;i<=right;i++){
              ans.add(matrix[top][i]);
        }
        top++;
        //top to bottom
        for(int i=top;i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
        //right to left
        for(int i=right;i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        }
        // bottom to top
        if(left<=right){
        for(int i=bottom;i>=top;i--){
            ans.add(matrix[i][left]);
        }
        left++;
        }
    }

    return ans;
    }
}
