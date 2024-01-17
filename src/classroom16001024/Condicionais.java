package classroom16001024;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
//		System.out.print("Digite sua idade: ");
//		int idade = in.nextInt();
//		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = in.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = in.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		in.close();
	}

}
