package binarySearchQuestion;
// https://leetcode.com/problems/single-element-in-a-sorted-array/submissions/1178894653/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        int ans = FindSingleElement(arr);
        System.out.println("Single element in sorted array : "  + ans);
    }
    public static int FindSingleElement(int[] arr){
        int start = 0;
        int end = arr.length -2;
        while (start <= end) {
            int mid = start + (end - start)/2;
            int midXor = mid ^ 1;
            if (arr[mid] == arr[midXor]) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return arr[start];
    }
}
