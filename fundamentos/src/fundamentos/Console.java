package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.println(" Dia");
		
		System.out.printf("MegaSena %d %d %d %d %n", 1,2,3,4);
		System.out.printf("Salário %.1f", 1234.567);
		System.out.printf("\nNome : %s%n", "João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome : ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome : ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade : ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("%s %s tem %d anos", nome,sobrenome,idade);
		
		entrada.close();
		
		
	}
}
