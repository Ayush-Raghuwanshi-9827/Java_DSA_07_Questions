package binarySearchQuestion;
//  https://leetcode.com/problems/sqrtx/
public class SquareRootOfElement {
    public static void main(String[] args) {
        int x = 8;
        System.out.println("The square Root of x is : " + mySqrt(x));
    }
    public static int mySqrt(int x) {
        int start = 1;
        int end = x /2;
        
        if(x == 1){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        while(start <= end){
            int mid = start + (end -start) /2;
            if(x % mid == 0 && mid == x / mid){
                return mid;
            }else if(mid > x / mid){
                end = mid -1;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
}
