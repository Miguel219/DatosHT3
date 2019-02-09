import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
/**
 * Silvio Orozco 18282
 * Jose Castaneda 18161
 * Roberto Castillo 185546
 * 
 * Datos Hoja 3 	Sort y Big O 	8/2/2019
 */
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
		Integer[] listaBS = new Integer[cantidad]; 
		Integer[] listaQS = new Integer[cantidad];
		Integer[] listaRS = new Integer[cantidad];
		Integer[] listaMS = new Integer[cantidad];
		Integer[] listaGS = new Integer[cantidad];
		Integer[] lista = new Integer[cantidad]; 
		for(int i = 0; i < cantidad; i = i + 1)
		{
			random=(int) (Math.random() * (cantidad-1)) + 1;
			lista[i]=(random);
			listaQS[i]=(random);
			listaBS[i]=(random);
			listaRS[i]=(random);
			listaGS[i]=(random);
			listaMS[i]=(random);
			
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
		Integer[] listaOrdenadaBS = (Integer[]) BubbleSort.bubble(listaBS);
			
		//Gnome Sort
		Integer[] listaOrdenadaGS = (Integer[])GnomeSort.gnomeSort(listaGS);
			
		//Merge Sort
		Comparable[] listaOrdenadaMS = MergeSort.mergesort(listaMS);
				
		//Quick Sort
		Integer[] listaOrdenadaQS = (Integer[])QuickSort.sort(listaQS);
				
		//Radix Sort
		Integer[] listaOrdenadaRS = (Integer[])RadixSort.radixsort(listaRS, listaRS.length);
				
		
		
		
		
		//Imprimimos la lista final en un archivo txt.
            try {
				impresora=new PrintWriter("listaOrdenadaBS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaBS.length; i++){
                	impresora.println("Dato" + (i+1) +": " +listaOrdenadaBS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}
		//
		//Imprimimos la lista final en un archivo txt.
            try {
				impresora=new PrintWriter("listaOrdenadaGS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaGS.length; i++){
                impresora.println("Dato" + (i+1) +": " +listaOrdenadaGS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}
			//
			//Imprimimos la lista final en un archivo txt.
            try {
				impresora=new PrintWriter("listaOrdenadaMS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaMS.length; i++){
                impresora.println("Dato" + (i+1) +": " +listaOrdenadaMS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}
			//
			//Imprimimos la lista final en un archivo txt.
            try {
				impresora=new PrintWriter("listaOrdenadaQS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaQS.length; i++){
                impresora.println("Dato" + (i+1) +": " +listaOrdenadaQS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}	
			//
			//Imprimimos la lista final en un archivo txt.
            try {
				impresora=new PrintWriter("listaOrdenadaRS.txt", "UTF-8");
				for (int i = 0; i < listaOrdenadaRS.length; i++){
                impresora.println("Dato" + (i+1) +": " +listaOrdenadaRS[i]);
                }
			} catch (FileNotFoundException | UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				impresora.close();
			}
		System.out.println("Lista original y final han sido impresas.");
		leer.next();
	}
}
