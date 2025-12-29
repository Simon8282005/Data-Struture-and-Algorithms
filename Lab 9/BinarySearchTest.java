package linear.search;

/**
 *
 * @author MP2-4
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        
        int result = bs.binarySearch(arr, 0, arr.length - 1, target);
        System.out.println("Target index: " + result);
        
        // Recursive binary
        int[] arr2 = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target2 = 23;
        
        int result2 = bs.recursiveBinarySearch(arr, 0, arr2.length - 1, target2);
        System.out.println("Target index: " + result2);
    }
}
