package ejer_14_21;

import java.util.Scanner;

public class Cheque {

	String monto="";
	String monto2="";
	String letters="";
	int cent;
	int dec;
	int unidad;
	int decimal;
	
	String[] unidades= {"", "uno", "dos", "tres", "cuatro", "cinco","seis", "siete", "ocho", "nueve" };
	String[] enas= {"diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve"}; 
	String[] decenas= {"veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
	String[] centenas= {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seisciencitos", "Setecientos", 
			"Ochocientos", "Novecientos"};
	
	
	public void decimales() {
		
				
		decimal=Integer.parseInt(monto.substring(4, 6));		
		letters+=decimal==0? "":" con " + decimal+ " /100"; 
		System.out.println(letters);
	}
	/*public void unidad() {
		
	
		unidad=Integer.parseInt(monto2.substring(3, 4));
		letters+=unidad!=0 ? unidades[unidad]: "";
		System.out.println(letters);	
	}*/
	
	public void cent() {
		
	
		cent=Integer.parseInt(monto2.substring(5, 6));
	
			letters=centenas[cent];
		
//		System.out.println(letters);	
		
	}
	
	public void dec() {
		
		unidad=Integer.parseInt(monto2.substring(3, 4));
		dec=Integer.parseInt(monto2.substring(4, 5));
		
//			letters+=dec==2&&unidad==0? " "+decenas[dec-2]:" "+decenas[dec-2]; 
			letters+=unidad==0? " "+decenas[dec-2]:(dec==2? " "+ "veinti": " "+ decenas[dec-2]+" y ");
			letters+=unidad!=0 ? unidades[unidad]: "";
//			System.out.println(letters);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cheque cheque=new Cheque();
		cheque.validarEntrada();
		cheque.cent();
		cheque.dec();
//		cheque.unidad();
		cheque.decimales();
		
		
	}
	
	
	public boolean validarEntrada() {
		
		boolean vcheque=false;
		
		
		Scanner entrada= new Scanner(System.in);
		
		while(!vcheque) {
			
			System.out.println("Por favor introduzca el monto, menor de 1,000$, con dos decimales separados por un '.'");
			monto=entrada.nextLine();
			
			String montoaux="";
			for(int i=0; i<monto.length(); i++)
				montoaux+=monto.charAt((monto.length()-1)-i);
			
			System.out.println(montoaux);
			
			if(montoaux.matches("\\d{2}\\.\\d{1,3}")) {
				monto2=montoaux;
				vcheque=true;
			}
			else System.out.println("Inténtelo de nuevo");
		}
		
		return true;
	}
	
	
	

}
