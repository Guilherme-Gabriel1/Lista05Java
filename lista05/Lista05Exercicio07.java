package lista05;

import java.util.Scanner;

public class Lista05Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota de 0 a 100: ");
		int nota = sc.nextInt();
		
		if(nota >= 90) {
			System.out.println("Nota A - Excelente");
		}else if(nota >= 80 && nota <= 89) {
			System.out.println("Nota B - Bom");
			
		}else if(nota >= 70 && nota <= 79) {
			System.out.println("Nota C - Satisfatório/Médio");
			
		}else if(nota >= 60 && nota <= 69) {
			System.out.println("Nota D - Insuficiente (mas aprovado)");
			
		}else if(nota < 60) {
			System.out.println("Nota F - Reprovado/Falha");
		}
		
		sc.close();
	}

}
