package lista05;

import java.util.Scanner;

public class Lista05Exercicio01 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = sc.nextInt();

	        boolean primo = true;

	        if (numero <= 1) {
	        	primo = false;
	        } else {
	           
	            for (int i = 2; i < numero; i++) {
	                if (numero % i == 0) {
	                	primo = false;
	                    break;
	            }
	        }

	      
	        if (primo) {
	            System.out.println("é primo!");
	        } else {
	            System.out.println("não é primo.");
	        }

	        sc.close();
	    }
	}
}
