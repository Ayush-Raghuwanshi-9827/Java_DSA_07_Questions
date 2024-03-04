package binarySearchQuestion;
public class KokoEatingBanana {

    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        int hour = 1000000000;
        int ans = MaxOfMin(arr, hour);
        System.out.println(ans);
    }
    public static int MaxOfMin(int[] piles, int hour){
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int i=0; i < piles.length; i++){
            if(high < piles[i]){
                high = piles[i];
            }
        }
        int k = -1;
        while (low <= high) {
            int mid = low + (high - low)  / 2;
            if(IsKokoFinish(piles,mid,hour)){
                k = mid;
                high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return k;
    }
    public static boolean IsKokoFinish(int[] piles, int ES, int hour){
        int ans = 0;
        for(int i =0; i < piles.length; i++){
            ans += piles[i] / ES;
            if(piles[i] % ES != 0){
                ans += 1;
            }
        }
        if (ans > hour) {
            return false;
        }
        return true;
    }
}