package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;
public class CalculadoraTeste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		
		calc.somaDoisNumeros();
		calc.subtraiDoisNumeros();
		calc.multiplicaDoisNumeros(5, 5);
		System.out.println(calc.divideDoisNumeros(20,0));
		System.out.println("Imprimindo dois numeros divididos: ");
		calc.imprimeDoisNumerosDivididos(20, 5);
		System.out.println("Continuar a execução.");
		
		
		int[] numeros = new int[] {1,2,3,4,5};
		calc.somaArray(numeros);
		calc.somaVarArgs(1,2,3,4,5,6);
		
	}

}
