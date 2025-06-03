package lista05;

import java.util.Scanner;

public class Lista05Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite umn numero e verifique se ele é divisivel por 3 e 5: ");
		double numero = sc.nextDouble();
		
		if(numero % 3 == 0 && numero % 5 == 0) {
			System.out.println("Número é divisivel por 3 e 5!");
			
		}else {
			System.out.println("Número não é divisivel por 3 e 5!");
		}
		
		sc.close();
	}

}
