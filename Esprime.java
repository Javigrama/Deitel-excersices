package ejer_16_19;


import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;



public class Esprime {

	static Scanner input=new Scanner(System.in);
	
	Set<Integer> set=new HashSet<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Escriba un número entero a factorizar\n");
		int n=input.nextInt();
		
		
		if(esPrimo(n)) System.out.print("El número es primo y no se puede factorizar");
		else System.out.print("Los factores primos son "+ factorize(n));
	}

	
	private static Set<Integer> factorize(int n) {
		
		Set<Integer> set=new HashSet<>();
		
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				set.add(i);
				n /= i;
			}
		}
		return set;
	}

	public static boolean esPrimo(int n) {
	 
		if (n==2) return true;
	    if (n%2==0) return false;
	 
	    	for(int i=3; i*i<=n;i+=2) {
	    		if(n%i==0)
	            return false;
	    }
	    	
	    return true;
	
	}
}
