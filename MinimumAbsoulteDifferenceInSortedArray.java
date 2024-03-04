package binarySearchQuestion;

public class MinimumAbsoulteDifferenceInSortedArray  {
    public static void main(String[] args) {
        int[] array = {2,5,6,8,10,55};
        int element = 6;
        findAbsoluteDifference(array, element);
        
    }
    public static void findAbsoluteDifference(int[] array, int element){
        int[] floorAndCiel= findFloorAndCiel(array, 0, array.length-1, element);
        if(floorAndCiel[0] == -1 && floorAndCiel[1] == -1){
            System.out.println("Array is Empty");
        }else if(floorAndCiel[0] == -1){
            int ans = Math.abs(floorAndCiel[1] - element);
            System.out.println("The Absolute difference of " + element+ " is : "+ ans);
        }else if (floorAndCiel[1] == -1) {
            int ans = Math.abs(floorAndCiel[0] - element);
            System.out.println("The Absolute difference of " + element+ " is : "+ ans);
        }else {
            int res = Math.min(Math.abs(floorAndCiel[0] -element), Math.abs(floorAndCiel[1] - element));
            System.out.println("The Absolute difference of " + element+ " is : "+ res);
        }
    }
 
    public static int[] findFloorAndCiel(int[] arr, int start, int end, int target){
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int res = -1;
        if(arr.length == 0){
            return ans;
        }
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target) {
                ans[0] = arr[mid];
                ans[1] = arr[mid];
                return ans;
            }else if (arr[mid] < target) {
                start = mid + 1;
                res = mid;
            }else {
                end = mid -1;
            }
        }
        if (start == arr.length) {
            ans[0] = arr[end];
            return ans;
        }else if (end == -1) {
            ans[1] = arr[start];
            return ans;
        }else {
        ans[0] = arr[end];
        ans[1] = arr[start];
        }
        return ans;
    } 
   
} 
