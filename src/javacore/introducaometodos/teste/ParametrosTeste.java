package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;
public class ParametrosTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int num1 = 5;
		int num2 = 10;
		calc.alteraDoisNumeros(num1, num2);
		System.out.println("Dentro do teste: ");
		System.out.println("Numero1: "+num1);
		System.out.println("Numero2: "+ num2);
		//os num1 e num2 aqui não foram alterados, imprimem os 2 tbm.
		//o valor original nao se altera. 
	}

}
