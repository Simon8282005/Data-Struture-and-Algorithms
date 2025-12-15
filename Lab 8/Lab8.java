package lab.pkg8;

import java.util.Random;
import java.util.Arrays;

public class Lab8 {
    // generate 100 randomly
    // using selection and insertion
    // task 2 plus to 1k and 10k, then compare the time they using 
    
    public static void main(String[] args) {
        int[] list = new int[10000];
        int[] list2 = new int[10000];
        
        Random rand = new Random();
        
        // Calling InsertionSort 
        InsertionSort insertionSort = new InsertionSort();
        
        for (int i = 0 ; i < list.length; i++) {
            list[i] = rand.nextInt(100);
            list2[i] = rand.nextInt(100);
        }
        
        
        // print out all element in list
        System.out.println("------------ Original Element -------------");
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));
        
        long startTime = System.nanoTime();
        SelectionSort(list);
        stopTimer(startTime);

        long startTime2 = System.nanoTime();
        insertionSort.sort(list2);
        stopTimer(startTime2);
        
        System.out.println("\n------------ After Sorting (Using Selection Sort) -------------");
        System.out.println(Arrays.toString(list));

        System.out.println("\n------------ After Sorting (Using Insertion Sort) -------------");
        System.out.println(Arrays.toString(list2));
        
    }
    
    public static void SelectionSort(int array[]) {
        int a = array.length;
        
        for (int i = 0; i < a; i++) {
            int minimum_index = i;
            for (int j = i + 1; j < a; j++) {
                if (array[j] < array[minimum_index]) {
                    minimum_index = j;
                }
            }
            
            int temp = array[minimum_index];
            array[minimum_index] = array[i];
            array[i] = temp;
        }
    }
    
    public static void stopTimer(long startTime) {
        // End the timer
        long endTime = System.nanoTime();

        long durationInNano = endTime - startTime;
        
        // Convert to more readable units (e.g., milliseconds, seconds)
        long durationInMillis = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(durationInNano);
        double durationInSeconds = durationInNano / 10000.0;
         
        System.out.printf("Duration: %.2f%n", durationInSeconds);
    }

}
