package binarySearchQuestion;
public class AllocateMinimumNumberOfPages {

    public static void main(String[] args) {
        int[] books = {12,34, 67,90};
        System.out.println(MinOfMax(books, 2));

    }
    public static int MinOfMax(int[] books, int students){
        if (students > books.length) {
            return -1;
        }
        int start = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0; i < books.length; i++){
            end += books[i];
            if (start < books[i]) {
                start = books[i];
            }
        }
        int res = -1;
        while (start  <= end) {
            int mid = start + (end - start) /2;
            if (isAllocationPossible(books,mid, students)) {
                res = mid;
                end = mid - 1;

            }else {
                start = mid + 1;
            }
        }
        return res;
    }
    public static Boolean isAllocationPossible(int[] books, int maxPages, int students){
        int currentStudent = 1;
        int pages = 0;
        for(int i=0; i< books.length; i++){
            pages += books[i];
            if(pages > maxPages) {
               currentStudent +=1;
               pages = books[i];
            }
            if (currentStudent > students) {
                return false;
            }
        }
        return true;
    }
}