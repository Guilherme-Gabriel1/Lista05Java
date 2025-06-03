package lista05;

import java.util.Scanner;

public class Lista05Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero e veirifique se é positivo, negativo ou zero: ");
		double numero = sc.nextDouble();
		
		if(numero == 0) {
			System.out.println("Número digitado é zero!");
			
		}else if(numero > 0) {
			System.out.println("Número digitado é positivo!");
			
		}else if(numero < 0) {
			System.out.println("Número digitado é negativo!");
		}
		
		
		sc.close();
	}

}
