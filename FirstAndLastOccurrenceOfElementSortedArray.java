 package binarySearchQuestion;

class FirstAndLastOccurrenceofElementSortedArray {
    public static int findElement(int[] arr, int start, int end, int element, Boolean isfirst){
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == element){
               res = mid;
               if(isfirst){
                end = mid -1;
               }else {
                start = mid + 1;
               }
               
            }else if(arr[mid] < element){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5,9};
        int ans = findElement(array, 0, array.length -1, 3, false);
        int ans2 = findElement(array, 0, array.length-1, 4, false);
        System.out.println(ans);
        System.out.println(ans2);
    }
}