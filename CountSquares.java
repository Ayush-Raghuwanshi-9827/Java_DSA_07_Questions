package binarySearchQuestion;
// https://www.geeksforgeeks.org/problems/count-squares3649/1
public class CountSquares {
    public static void main(String[] args) {
        // Only input exactly square root numbers Likes :  1,4,9,16... and output is less than its square root: 0, 1, 2, 3
        int x = 9;
        System.out.println(countSquares(x));
    }
    public static int countSquares(int x) {
        // code here
         int start = 1;
        int end = x /2;
        
        if(x == 1){
            return 0;
        }
        while(start <= end){
            int mid = start + (end -start) /2;
            if(x % mid == 0 && mid == x / mid){
                return mid -1;
            }else if(mid > x / mid){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
}
