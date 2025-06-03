package lista05;

import java.util.Scanner;

public class Lista05Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano que deseja verificar se é bissexto: ");
		int ano = sc.nextInt();
		
		if(ano == 1900) {
			System.out.println("Ano é bissexto!");
		}else {

			
		if(ano % 4 == 0) {
			System.out.println("Ano é bissexto!");
		}else {
			System.out.println("Ano não é bissexto!");
		}
		}
		
		sc.close();
	}

}
