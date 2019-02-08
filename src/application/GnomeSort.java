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



public class GnomeSort {
	
    public static Comparable[] gnomeSort(Comparable[] nums){ //takes unsorted array, returns sorted
        int index=1; //start of search
        int temp;
        while(index<nums.length){ //until the array is fully sorted
            if(nums[index].compareTo(nums[index-1])<0){ //compares nums[index] with nums[index-1]. if smaller, switch.
                temp=(int) nums[index];
                nums[index]=nums[index-1];
                nums[index-1]=temp;
                index--; //must decrease index to recheck. since they have been swapped, the array may still be out of order
                if(index==0){ //prevents index from going lower than 1
                    index=1;
                }
            }
            else{
                index++; //if sorted, go up
            }
        }
        return(nums); //reaching the end of the array- completely sorted, returns nums
    }
}
