package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		int v;
		char opcion=0;
		
		for(int i=0;i<=tabla.length-1;i++) {
			tabla[i]= (int) (Math.random()*100+1);
		}
		
		System.out.println();
		while(opcion!='c') {
			
			System.out.println("Elija una opcion");
			System.out.println("a. Mostrar valores");
			System.out.println("b. Eliminar valor");
			System.out.println("c. Salir");
			opcion = sc.next().charAt(0);
			
			switch(opcion) {
			case 'a':
				System.out.println(Arrays.toString(tabla));
				break;
			case 'b':
				System.out.println("Introduzca el valor que quiera eliminar");
				v = sc.nextInt();
				int x=0;
				
				while(x<=tabla.length-1) {
					if(tabla[x]!=v) {
						x++;
					}else {
						System.arraycopy(tabla, x+1, tabla, x, tabla.length-x-1);
						tabla=Arrays.copyOf(tabla, tabla.length-1);
					}
				}
				break;
			}
			
		}
		System.out.println("Saliendo del programa");
		
	}

}
