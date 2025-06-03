package lista05;

import java.util.Scanner;

public class Lista05Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double primeiraNota = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double segundaNota = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double terceiraNota = sc.nextDouble();
		
		double media = (primeiraNota + segundaNota + terceiraNota) / 3;
		
		if(media < 5) {
			System.out.println("Reprovado!");
			}else if(media == 5) {
				System.out.println("Recuperação!");
			}else {
				System.out.println("Aprovado!");
				
			}
		
		sc.close();
	}

}
