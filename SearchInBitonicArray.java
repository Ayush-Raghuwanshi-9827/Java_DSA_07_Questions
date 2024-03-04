package binarySearchQuestion;

public class SearchInBitonicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,9,8,7,6,5,2};
        // System.out.println("Minimum ELement in this array is : " + MinimumElementInBitonicArray(arr));
        // int max = MaximumElementInBitonicArray(arr);
        // System.out.println("Maximum ELement in this array is : " + arr[max]);
        int element = 66;
        int SearchElement = SearchElementInBitonicArray(arr, element);
        if(SearchElement == -1) System.out.println("Element not found");
        else System.out.println("The element " + element+" at index : " + SearchElement);


    }
    public static int MinimumElementInBitonicArray(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is Empty");
            return -1;
        }else if(arr.length == 1){
            return arr[0];
        }
        int ans = Math.min(arr[0], arr[arr.length-1]);
        return ans;
    }

    public static int MaximumElementInBitonicArray(int[] arr){
        if(arr.length == 0)  return -1;
        else if(arr.length == 1) return arr[0];
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end -start)/2;
            int next = (mid+1) % arr.length;
            int prev = (mid-1+arr.length) % arr.length;
            if(arr[mid] > arr[prev] && arr[mid] > arr[next]){
                ans = mid;
                return ans;
            }else if(arr[mid] > arr[prev] && arr[mid] < arr[next]){
                start = mid +1;
            }else if (arr[mid] > arr[next] && arr[mid] < arr[prev]) {
                 end = mid -1;
            }
        }
        return ans;
    }
    public static int SearchElementInBitonicArray(int[] arr, int target){
        if(arr.length == 0){
            System.out.println("Array is Empty");
            return -1;
        }
        int ans = -1;
        int peak = MaximumElementInBitonicArray(arr);
        if(arr[peak] >= target){
            if(arr[peak] == target) {
                return peak;
            }
             ans = binarySearchIncreasingOrder(arr, 0, peak -1, target, true);
            if(ans == -1){
                ans = binarySearchIncreasingOrder(arr, peak +1, arr.length, target, false);
            }
        }
        return ans;
        
    }
    public static int binarySearchIncreasingOrder(int arr[], int start, int end, int target,Boolean isInc){
        if(arr.length == 0) return -1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end -start) /2;
            if(arr[mid] == target){
                ans = mid;
                return ans;
            }else if(arr[mid] < target){
                if(isInc){
                    start = mid +1;
                }else {
                    end = mid -1;
                }
            }else {
                if(isInc){
                     end = mid -1;
                }else {
                     start = mid + 1;
                }
            }
        }
        return ans;
    }
}
