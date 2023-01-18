package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		int x=0;
		
		for(int i=0;i<=tabla.length-1;i++) {
			System.out.println("Introduzca un numero");
			tabla[i] = sc.nextInt();
		}
		
		while(x<=tabla.length-1) {
			if(esPrimo(tabla[x])==true) {
				x++;
			}else {
				System.arraycopy(tabla, x+1, tabla, x, tabla.length-x-1);
				tabla=Arrays.copyOf(tabla, tabla.length-1);
			}
		}
		
		System.out.println(Arrays.toString(tabla));
		
	}
	
	public static boolean esPrimo(int num) {
		//Declaramos la variable que vamos a usar en la funcion
		boolean primo = true;
		
		//Este bucle no parara hasta que el valor de i sea igual que el del numero introducido
		//i es igual a 2 asi podremos usarla para averiguar si el numero es primo
		for(int i=2;i<num;i++) {
			//Si el valor de i es un divisor del numero introducido significa que el numero introducido no es primo pues un numero primo solo puede ser dividido entre 1 o el mismo
			if(num%i==0) {
				primo=false;
			}
		}
		
		//Devolvemos el resultado
		return primo;
	}

}
