package lista05;

import java.util.Scanner;

public class Lista05Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do Triângulo");
		double primeiro = sc.nextDouble();
		
		System.out.println("Digite o segundo lado do Triângulo");
		double segundo = sc.nextDouble();
		
		System.out.println("Digite o terceiro lado do Triângulo");
		double terceiro = sc.nextDouble();
		
		if (primeiro == segundo && primeiro == terceiro && segundo == terceiro) {
			System.out.println("O Triângulo é Equilátero!");
			
		}else if (primeiro == segundo || primeiro == terceiro || segundo == terceiro) {
			System.out.println("O Triângulo é isósceles!");
			
		}else if (primeiro != segundo || primeiro != terceiro || segundo != terceiro){
			System.out.println("O Triângulo é escaleno!");
			
		}
			
		sc.close();
	}

}
