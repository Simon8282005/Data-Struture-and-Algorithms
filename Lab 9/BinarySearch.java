package linear.search;

/**
 *
 * @author MP2-4
 */

class BinarySearch {
    // Returns index of x if it is presenet in arr[ l... r]
    // else return -1
    
    int binarySearch(int arr[], int l, int r, int x) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            
            if (arr[mid] == x) {
                return mid;
            }
            
            if (arr[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            
        }
        
        return -1;
    }
    
    int recursiveBinarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = 1 + (r - 1) / 2;
            
            if (arr[mid] == x) {
                return mid;
            }
            
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            
            return binarySearch(arr, mid + 1, r, x);
        }
        
        return -1;
    }
}
