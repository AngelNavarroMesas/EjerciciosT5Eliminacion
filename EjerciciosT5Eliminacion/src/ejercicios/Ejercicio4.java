package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int tabla[] = new int[20];
		int x=0, num;
		
		for(int i=0;i<=tabla.length-1;i++) {
			tabla[i]=(int) (Math.random()*10);
		}
		
		System.out.println("Introduzca un numero entre 0 y 10");
		num = sc.nextInt();
		
		while(x<=tabla.length-1) {
			if(tabla[x]>num) {
				System.arraycopy(tabla, x+1, tabla, x, tabla.length-x-1);
				tabla=Arrays.copyOf(tabla, tabla.length-1);
			}else {
				x++;
			}
		}
		System.out.println(Arrays.toString(tabla));
		
	}

}
