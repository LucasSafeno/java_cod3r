package exercicios;

public class Temperatura {
	public static void main(String[] args) {
		// formula : (F - 32 ) * 5/9 = C
		
		// Constantes
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		// Variaveis
		double fahrenheit = 86;
		//Resultado
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é : " + celsius + " ºC");
		
		fahrenheit = 100;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado é : " + celsius + " ªC");
		
		
	}
}
