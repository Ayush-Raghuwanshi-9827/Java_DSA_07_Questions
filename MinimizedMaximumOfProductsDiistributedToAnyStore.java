package binarySearchQuestion;
// Question Link
// https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/
public class MinimizedMaximumOfProductsDiistributedToAnyStore {
    public static void main(String[] args) {
        int[] arr = {15,10,10};
        int n = 7;
        int ans = ProductDistribution(arr, n);
        System.out.println("The maximum product distribution is : " + ans);
    }
    public static int ProductDistribution(int[] quantities, int n){
    int start = 1;
    int end = Integer.MIN_VALUE;
    for(int i=0; i< quantities.length; i++){
        if(quantities[i] > end){
            end = quantities[i];
        }
    }

    int res = -1;
    while(start <= end){
        int mid = start + (end - start) / 2;
        if(isDistributionPossible(quantities, mid, n)){
            res = mid;
            end = mid - 1;

        }else{

            start = mid + 1;
        }

    }
    return res;
}
public static boolean isDistributionPossible(int[] quantities, int maxP, int store){
    int storeCount = 0;
    for(int i=0; i < quantities.length; i++){
        storeCount += quantities[i] / maxP;
        if(quantities[i] % maxP != 0){
            storeCount += 1;
        }
    }
    if(storeCount > store){
        return false;
    }
    return true;
}
}
