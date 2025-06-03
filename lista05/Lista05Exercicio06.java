package lista05;

import java.util.Scanner;

public class Lista05Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		if (numero % 2 == 0 && numero > 0) {
			System.out.println("Numero par!");
			System.out.println("Numero Positivo!");
			
		}else if(numero % 2 != 0 && numero > 0){
			System.out.println("Numero impar!");
			System.out.println("Numero é positivo!");
			
		}else if(numero == 0){
			System.out.println("Numero par!");
			System.out.println("Numero é zero!");
			
		}else if(numero % 2 == 0 && numero < 0) {
			System.out.println("Numero par!");
			System.out.println("Numero é negativo!");
		
		}else if(numero % 2 != 0 && numero < 0){
			System.out.println("Numero impar!");
			System.out.println("Numero é negativo!");
		}
		
		
		sc.close();
	}

}
