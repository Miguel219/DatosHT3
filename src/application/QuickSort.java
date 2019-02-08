package application;

/**
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 * Roberto Castillo 185546
 *
 * Referencia: 
 * @author Duane A. Bailey 
 * Data Structures in Java for the Principled Programmer
 */


public class QuickSort {
     
    private static Comparable[] array;
    private static int length;
 
    static Comparable[] sort(Comparable[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return null;
        }
        array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        return array;
    }
 
    static void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = (int) array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i].compareTo(pivot)<0) {
                i++;
            }
            while (array[j].compareTo(pivot)>0) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    static void exchangeNumbers(int i, int j) {
        int temp = (int) array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}