package ejer_16_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.TreeSet;



public class Nombres {

	static String[] names= {"Javier", "Miriam", "Maria Jose", "Manolo", "Miriam", "Miriam", "Gabriel", "Gabriel"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> listnames = Arrays.asList(names);
		Collections.sort(listnames);
		Set<String> pila= new HashSet<>(Arrays.asList(names));
	
		for(String i: pila)
			System.out.println(i);
		System.out.println();
		SortedSet<String>pila1=new TreeSet<>(Arrays.asList(names));
		for(String i: pila1)
			System.out.println(i);
		
		System.out.println("Escriba el nombre que desea buscar");
		
		Scanner input=new Scanner(System.in);
		String name=input.next();
		
		  System.out.println("Buscando a " + name);
		  System.out.print(listnames+" ");
//		  ----------------------------------con list---------------------------
	      int result = Collections.binarySearch(listnames, name); //bnarysearch es para list ya que deben estar ordenados en orden ascendente ademas
	      
	      if (result >= 0)
	         System.out.printf("Found at index %d%n", result);
	      else
	         System.out.printf("Not Found (%d)%n",result);
	      
//	      ------------------------------------------------------------ con set---------------------
	      System.out.println(pila1.contains(name)? name +" is on list": name+" isnt in list");
	 
	      Iterator<String> iterator=pila1.iterator();
	      Spliterator<String> it=pila1.spliterator();
	
	      
	      while(iterator.hasNext()) {
	    	  
//	    	  if(iterator.next().equalsIgnoreCase(name)) System.out.print(name +" esta");
	    	  
	    	  System.out.print(iterator.next()+" ");
	    	
	    			
	      }
	      }
	}


