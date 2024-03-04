package binarySearchQuestion;

public class BinarySearcchOnSortedRotatedArray {
    public static void main(String[] args) {
        // int[] arr = {};
        // int ClockWiseRotation = CountRotation(arr);
        // System.out.println("The Rotation count in clockwise direction : " + ClockWiseRotation);
        // System.out.println("The Rotation count in Anti clock wise Direction is : " + (arr.length - ClockWiseRotation)% arr.length);
        // int MaxInRotatedSortedArray = maxElementInRotatedSortedArray(arr);
    }
        public static int CountRotation(int[] arr){
        if(arr.length ==  0){
            System.out.println("Array is Empty");
            return -1;
        }
        int start =0;
        int end = arr.length -1;
        while (start < end) {
            int mid = start +(end - start)/2;
            if (mid > 0 && arr[mid] < arr[mid -1]) {
                return mid;
            }else if(arr[mid] < arr[end]){
                end = mid -1; 
            }else {
                start = mid +1;
            }
        }
        return start;
    } 
    public static int maxElementInRotatedSortedArray(int[] arr){
        if(arr.length ==  0){
            System.out.println("Array is Empty");
            return -1;
        }
       int start = 0;
       int end = arr.length -1;
        while (start < end) {
            int mid = start +(end - start)/2;
            if (mid < arr.length -1 && arr[mid] > arr[mid +1]) {
                return mid;
            }else if(arr[mid] < arr[start]){
                end = mid -1; 
            }else {
                start = mid +1;
            }
        }
        return end;
    }
} 
