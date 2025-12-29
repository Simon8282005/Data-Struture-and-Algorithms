package linear.search;

/**
 *
 * @author Chong Yu
 */
public class LinearSearch {
    public static int linearSearch(int[] arr, int N, int x) {
        for (int i = 0 ; i <= N - 1; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 80, 20, 90, 4};
        int key = 30;
        
        System.out.println("Target index: " + linearSearch(arr, arr.length, key));
    }
    
}
