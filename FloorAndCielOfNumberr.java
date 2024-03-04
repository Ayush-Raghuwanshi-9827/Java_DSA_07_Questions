package binarySearchQuestion;

public class FloorAndCielOfNumberr {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,7,7,8,10};
        int floor = findFloor(array, 0, array.length-1, 8);
        int ciel =  findCiel(array, 0, array.length-1, 8);
        System.out.println("Floor : " + floor + " " +  "Ciel : " + ciel);

    }
    public static int findFloor(int[] arr, int start, int end, int target){
        int res = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target) {
                res = mid;
                break;
            }else if (arr[mid] < target) {
                start = mid + 1;
                res = mid;
            }else {
                end = mid -1;
            }
        }
        return res;

    }

    public static int findCiel(int[] arr, int start, int end, int target){
        int res = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] == target) {
                res = mid;
                break;
            }else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                end = mid -1;
                res = mid;
            }
        }
        return res;

    }
} 
