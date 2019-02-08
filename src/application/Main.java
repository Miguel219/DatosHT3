package application;

import java.util.Scanner;
import java.util.Collections;

public class Main {
	
	public static void main(String [ ] args){
	
		//Creamos nuestro scanner
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
		int[] listaOrdenada = new int[cantidad];
		BubbleSort bub = new BubbleSort();
		listaOrdenada= bub.bubble(lista);
		for(int i = 0; i < listaOrdenada.length; i = i + 1)
		{
			System.out.println(listaOrdenada[i]);
			
		}
		
	}
}
