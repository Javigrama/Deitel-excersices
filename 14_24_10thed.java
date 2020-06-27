package ejer14_24;

import java.util.Scanner;

public class Corrector {
	
	static String[] listaDePalabras= {"predeterminado"};
	
	static String palabra;
	private static boolean find=false;
	private static boolean choice=true;
	private String respuesta="";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Corrector cor=new Corrector();
		Scanner entrada=new Scanner(System.in);
		
		
		while(choice) {
		find=false;
		System.out.print("Introduzca una palabra\n");
		palabra=entrada.nextLine();
		
		palabra=palabra.trim();
		StringBuilder sb=new StringBuilder(palabra);
		
		for(String i: listaDePalabras)
			if(palabra.equalsIgnoreCase(i)) {
				System.out.println("La palabra está escrita correctamente");
				find=true;
			}
		if(!find) System.out.println("La palabra NO está escrita correctamente");
			
	
		if(!find) cor.primeraSegunda(sb);
		if(!find) cor.letraDoble(sb);
		if(!find) cor.bPorV(sb);
	
		
		if(!find) {
			
			System.out.println("No hemos encontrado la palabra. Desea añadirla a la eciclopedia?");
			if(entrada.nextLine().matches("SI|Si|si|sI|s|S|YES|Y|Yes|y")) cor.anexarPalabra();
			
		}
		
		System.out.println("Desea comprobar otra palabra");
		if(entrada.nextLine().matches("NO|No|N|no|n"))choice=false;
		}

		
		System.out.println("Valoramos su aportacion");
	}
	
	
	public void anexarPalabra() {
		
		
			String t[]=new String[listaDePalabras.length+1]; 

			for(int i=0; i<listaDePalabras.length; i++)
				t[i]=listaDePalabras[i];
			
				listaDePalabras=t;
				
				listaDePalabras[listaDePalabras.length-1]=palabra;
				
				for(int i=1; i<listaDePalabras.length; i++) 
					for(int j=listaDePalabras.length-1; j>=i; j--) {
						if(listaDePalabras[j-1].compareTo(listaDePalabras[j])>0) {
							String aux=listaDePalabras[j-1];
							listaDePalabras[j-1]=listaDePalabras[j];
							listaDePalabras[j]=aux;
						}
					}
				System.out.println("No tenemos constancia de esta palabra por lo que la añadimos a la enciclopedia");
				System.out.print("Nuestra lista tiene "+listaDePalabras.length+" palabras\n");
			find=true;
			
	}
		
	public void primeraSegunda(StringBuilder sb) {
			
		StringBuilder s=new StringBuilder(sb);
		Scanner entrada=new Scanner(System.in);

			s.insert(2, s.charAt(0));
			s.deleteCharAt(0);
				 for(String i: listaDePalabras)		
						if(String.valueOf(s).equalsIgnoreCase(i)) {
							System.out.println("quizá usted quiso decir "+ s+" ?");
							respuesta=entrada.nextLine();
							if(respuesta.matches("SI|Si|si|sI|s|S|YES|Y|Yes|y")) find=true;
						}
				
	}
		
	public void letraDoble(StringBuilder sb) {
				
		StringBuilder s=new StringBuilder(sb);
		Scanner entrada=new Scanner(System.in);

		
			for(int i=0; i<s.length()-1; i++)
				if(s.charAt(i)==s.charAt(i+1)) s.deleteCharAt(i);
					
			for(String i: listaDePalabras)		
					if(String.valueOf(s).equalsIgnoreCase(i)) {
						System.out.println("A pesar de todo parece probable que quisiera decir "+ s+" ?");
						respuesta=entrada.nextLine();
						if(respuesta.matches("SI|Si|si|sI|s|S|YES|Y|Yes|y")) find=true;
				
			}
	}
	
	public void bPorV(StringBuilder sb) {
		
		StringBuilder s=new StringBuilder(sb);
		Scanner entrada=new Scanner(System.in);
		
			for(int i=0; i<s.length(); i++)
				if(s.charAt(i)=='v') s.setCharAt(i, 'b');
			
			 for(String i: listaDePalabras)		
					if(String.valueOf(s).equalsIgnoreCase(i)) {
						System.out.println("quizá usted quiso decir "+ s+" ?");
						respuesta=entrada.nextLine();
						if(respuesta.matches("SI|Si|si|sI|s|S|YES|Y|Yes|y")) find=true;
					}
	}

}
