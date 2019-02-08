package application;
/**
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 * Roberto Castillo 185546
 *
 * Referencia de ayuda;
 * https://www.geeksforgeeks.org/bubble-sort/
 */
public class BubbleSort 
{
    
    public static Comparable[] bubble(Comparable[] A)
    {
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(((Index)A[j+1]).getNum()<((Index)A[j]).getNum()){
                      aux=((Index)A[j+1]).getNum();
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
    return A;
    }    
    
    
}