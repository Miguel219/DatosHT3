package application;

/**
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 * Roberto Castillo 185546
 *
 *Referencia:
 * @author Robert Sedgewick and Kevin Wayne
 * extraido de http://algs4.cs.princeton.edu/14analysis/Mergesort.java.html
 */



public class MergeSort{
	
    private static Comparable[] merge(Comparable[] a, Comparable[] b) {
    	Comparable[] c = new Comparable[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = (int) b[j++];
            else if (j >= b.length) c[k] = (int) a[i++];
            else if (a[i].compareTo(b[j])<=0)  c[k] = (int) a[i++];
            else                    c[k] = (int) b[j++];
        }
        return c;
    }
 	
    public static Comparable[] mergesort(Comparable[] input) {
        int N = input.length;
        if (N <= 1) return input;
        Integer[] a = new Integer[N/2];
        Integer[] b = new Integer[N - N/2];
        for (int i = 0; i < a.length; i++)
            a[i] = (Integer) input[i];
        for (int i = 0; i < b.length; i++)
            b[i] = (Integer) input[i + N/2];
        return merge(mergesort(a), mergesort(b));
    }
    
    //Check if array is sorted
    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i].compareTo(a[i-1])<0) return false;
        return true;
    }
}