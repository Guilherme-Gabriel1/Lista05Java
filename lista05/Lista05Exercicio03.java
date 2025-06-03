package lista05;

import java.util.Scanner;

public class Lista05Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = sc.nextFloat();
		
		System.out.println("Digite a sua altura: ");
		double altura = sc.nextFloat();
		
		double imc = peso / (altura * altura) ;
		
		
		if(imc < 18.5) {
			System.out.println("Abaixo do peso!");
		}else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal!");
		}else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		}else if(imc >= 40) {
			System.out.println("Obesidade Grau III");
		}
		
		sc.close();
	}

}
