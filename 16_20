package ejer_16_20;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Palabro {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Escriba una frase\n");
		String frase=input.nextLine();
		String[] splitter=frase.split(", | ");
		
		for(String i: splitter)
			System.out.print(i+" ");
		
		
		for(int i=0; i<splitter.length; i++)
			splitter[i]=splitter[i].toLowerCase();
		System.out.println();
		
		SortedSet<String> sort=new TreeSet<>(Arrays.asList(splitter));
		
		for(String i: sort)
			System.out.print(i+" ");
		
	}

}
