package application;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

public class MyTests {

    @Test
    public void sortTester() {
    	// Se crea nuestras listas de prueba
    	// La primer lista esta ordenada como deberia de ser.
    	Integer[] listaOrdenadaReal = new Integer[5];
    	listaOrdenadaReal[0]=1;
    	listaOrdenadaReal[1]=2;
    	listaOrdenadaReal[2]=3;
    	listaOrdenadaReal[3]=4;
    	listaOrdenadaReal[4]=5;
        // La segunda lista esta desordenada y debe de ser ordenada.
        Integer[] listaDePruebaDesordenada = new Integer[5];
        listaDePruebaDesordenada[0]=4;
        listaDePruebaDesordenada[1]=1;
        listaDePruebaDesordenada[2]=3;
        listaDePruebaDesordenada[3]=5;
        listaDePruebaDesordenada[4]=2;
        //Quinta Prueba RadixSort
       	assertArrayEquals(listaOrdenadaReal, RadixSort.radixsort(listaDePruebaDesordenada, listaDePruebaDesordenada.length));
        //Cuarta Prueba QuickSort
        //assertArrayEquals(listaOrdenadaReal, QuickSort.sort(listaDePruebaDesordenada));
        //Tercera Prueba MergeSort
        //assertArrayEquals(listaOrdenadaReal, MergeSort.mergesort(listaDePruebaDesordenada));
        //Segunda Pruba GnomeSort
        //assertArrayEquals(listaOrdenadaReal, GnomeSort.gnomeSort(listaDePruebaDesordenada));
        // Primer Prueba BubbleSort
        //assertArrayEquals(listaOrdenadaReal, BubbleSort.bubble(listaDePruebaDesordenada));
        
        
    }

	
}