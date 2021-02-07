import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        // YOUR CODE HERE
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        // YOUR CODE HERE
        if (i == list.size() - 1){
            return true;
        }
        return (list.get(i) <= list.get(i+1) && isSortedRec(list, i + 1));
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        // YOUR CODE HERE
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int realCount, int i) {
        // YOUR CODE HERE
        if (i == arr.length){
            return (count == realCount);
        }
        else if (arr[i] == x){
            return hasCountCopiesRec(arr, x, count, realCount + 1, i + 1);
        }
        else {
            return hasCountCopiesRec(arr, x, count, realCount, i + 1);
        }
    }




    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        // YOUR CODE HERE
        return binarySearchRec(arr, num, 0, arr.length - 1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        // YOUR CODE HERE
        int middleIndex = lowerBound + (upperBound - lowerBound)/2;
        if (upperBound < lowerBound){
            return false;
        }
        if (num > arr[middleIndex]){
            return binarySearchRec(arr, num, middleIndex + 1, upperBound);
        }
        if (num < arr[middleIndex]){
            return binarySearchRec(arr, num, lowerBound, middleIndex - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
