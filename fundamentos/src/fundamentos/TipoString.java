package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!"));
		
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		System.out.println(s.length());
		
		System.out.println(s.endsWith("tarde"));
		
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Lucas";
		var sobrenome = "Tenório";
		var idade = 30;
		var salario = 12345.987;
		
		//System.out.println("Nome : " + nome + "\nSobrenome :"+ sobrenome + "\nIdade : "+ idade +"\nSalário : " + salario + "");
		System.out.printf("O senhor  %s %s %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor  %s %s %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	} // main
} // TipoString