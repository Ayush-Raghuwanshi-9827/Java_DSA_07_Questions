package binarySearchQuestion;

public class FindTheSmallestDivisorLessThanThreeshold {
    public static void main(String[] args) {
        int[] arr = {1,2,5,9};
        int threeshold = 6;
        System.out.println(FindDivisor(arr, threeshold));
    }   
    public static int FindDivisor(int[] nums, int threshold){
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] > end){
                end = nums[i];
            }
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(divisorIsPoss(nums, mid, threshold)){
              ans = mid;
              end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static boolean divisorIsPoss(int[] nums, int mid, int threshold){
        int dividend = 0;
        for(int i=0; i < nums.length; i++){
            dividend += Math.ceil((double)nums[i] / (double)mid);
        }
        if(dividend <= threshold){
            return true;
        }
        return false;
    }
}
