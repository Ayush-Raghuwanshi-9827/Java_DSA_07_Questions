package binarySearchQuestion;
// https://leetcode.com/problems/search-a-2d-matrix/description/
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };
        int target  = 10;
        System.out.println(FindTarget(arr, target));

    }
    public static Boolean FindTarget(int[][] arr, int target){
        int R = arr.length;
        int C = arr[0].length;
        for(int i=0; i < R; i++){
            if (arr[i][C-1] >= target) {
                int start = 0;
                int end = arr[i].length-1;
                while (start <= end) {
                    int mid= start + (end -start)/2;
                    if (arr[i][mid]  == target) {
                        return true;
                    }else if (arr[i][mid] < target)  {
                        start = mid +1;
                    }else {
                        end = mid -1;
                    }
                }   
            }
        }
        return false;
    }
}
