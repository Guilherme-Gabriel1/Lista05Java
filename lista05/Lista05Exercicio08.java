package lista05;

import java.util.Scanner;

public class Lista05Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade < 12) {
			System.out.println("Você é uma criança!");
			
		}else if(idade >= 12 && idade <= 17) {
			System.out.println("Você é um adolescente!");
			
		}else if(idade >= 18 && idade <= 59) {
			System.out.println("Você é adulto!");
			
		}else if(idade >= 60) {
			System.out.println("Você é idoso!");
		}
		
		sc.close();
	}

}
