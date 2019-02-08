package application;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Main {
	public static void main(String [ ] args){
	   
		//Creamos nuestro scanner y nuestra impresora
		PrintWriter impresora = null;
		Scanner leer = new Scanner(System.in);
		
		//Este el sistema para calcular los tiempos de cada uno de los algoritsmos de sort.
		//Para comenzar pedimos la cantidad de numeros random enteros a ordenar.
		System.out.println("Bienvenido al sistema de ordenamiento por SORTS.");
		System.out.println("Ingrese la cantidad de numeros que desea ordenar: ");
		boolean error=false;
		int cantidad=0;
		//Verificamos que el dato ingresado es un entero
		do{
			try {
				cantidad= Integer.parseInt(leer.next());
				if(cantidad<10 || cantidad>3000){
					throw new NumberFormatException("Error numero entero");
				}
				error=false;
			}catch(NumberFormatException e){
				error=true;
				System.out.println("Error, debe ingresar enteros entre 10 y 3000.: ");
				System.out.println("Ingrese la cantidad de numeros que desea ordenar entre 10 y 3000: ");
			}
		}while(error==true);
		//Una vez el dato es entero creamos el numero Random.
		int random;
		int[] lista= new int[cantidad]; 
		for(int i = 0; i < cantidad; i = i + 1)
		{
			random=(int) (Math.random() * (cantidad-1)) + 1;
			lista[i]=(random);
			
		}
		//Imprimimos la lista original en un archivo txt.
            try {
				impresora=new PrintWriter("listaOriginal.txt", "UTF-8");
				for (int i = 0; i < lista.length; i++){
                impresora.println("Dato" + (i+1) +": " +lista[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
            }
            
        
        
   		 
		
		

		//Pruebas de algoritmos
		//Bubble Sort
		int[] listaOrdenadaBS = BubbleSort.bubble(lista);
			
		//Gnome Sort
		int[] listaOrdenadaGS = GnomeSort.gnomeSort(lista);
			
		//Merge Sort
		int[] listaOrdenadaMS = MergeSort.mergesort(lista);
				
		//Quick Sort
		int[] listaOrdenadaQS = QuickSort.sort(lista);
				
		//Radix Sort
		int[] listaOrdenadaRS = RadixSort.radixsort(lista, lista.length);
				
		
		
		BubbleSort.bubble(listaOrdenadaBS);
		GnomeSort.gnomeSort(listaOrdenadaGS);
		MergeSort.mergesort(listaOrdenadaMS);
		QuickSort.sort(listaOrdenadaQS);
		RadixSort.radixsort(listaOrdenadaRS, listaOrdenadaRS.length);
		
		
		//Imprimimos la lista final en un archivo txt.
        try {
				impresora=new PrintWriter("listaFinal.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaQS.length; i++){
                	impresora.println("Dato" + (i+1) +": " +lista[i]);
                }
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}finally{
				impresora.close();
		}
		System.out.println("Lista original y lista ordenada han sido impresas en archivos txt.");
	}
}
