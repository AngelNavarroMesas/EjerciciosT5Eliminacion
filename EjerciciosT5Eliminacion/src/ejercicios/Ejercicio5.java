package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[10];
		int num1, num2, media;
		
		for(int i=0;i<=tabla.length-1;i++) {
			System.out.println("Introduzca un numero favorito");
			tabla[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(tabla));
		while(tabla.length>2) {
			do {
				num1 = (int) (Math.random()*tabla.length-1);
				num2 = (int) (Math.random()*tabla.length-1);
			}while(num2==num1);
			
			media = (tabla[num1]+tabla[num2])/2;
			
			System.arraycopy(tabla, num1+1, tabla, num1, tabla.length-num1-1);
			System.arraycopy(tabla, num2+1, tabla, num2, tabla.length-num2-1);
			tabla = Arrays.copyOf(tabla, tabla.length-1);
			tabla[tabla.length-1]=media;
			
			System.out.println(Arrays.toString(tabla));
		}
		
		media = (tabla[0]+tabla[1])/2;
		tabla = Arrays.copyOf(tabla, tabla.length-1);
		tabla[0] = media;
		
		System.out.println(Arrays.toString(tabla));
	}

}
