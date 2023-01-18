package ejercicios;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int tabla[] = new int[20];
		int x=0;
		
		for(int i=0;i<=tabla.length-1;i++) {
			tabla[i]=(int) (Math.random()*100+1);
		}
		System.out.println(Arrays.toString(tabla));
		
		
		while(x<=tabla.length-1) {
			if(tabla[x]%2==0) {
				x++;
			}else {
				System.arraycopy(tabla, x+1, tabla, x, tabla.length-x-1);
				tabla=Arrays.copyOf(tabla, tabla.length-1);
			}
		}
		
		
		System.out.println(Arrays.toString(tabla));
		
	}

}
