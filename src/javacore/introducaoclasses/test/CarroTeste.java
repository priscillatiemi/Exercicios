package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Carro;
public class CarroTeste {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.modelo = "Ferrari";
		carro.placa = "QMJ1212";
		carro.velocidadeMaxima = 120f;
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		System.out.println(carro.velocidadeMaxima);

	}

}
