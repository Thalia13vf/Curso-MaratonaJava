package br.com.abc.javacore.sobrecargaconstrututores.test;

import br.com.abc.javacore.sobrecargaconstrututores.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante estudante = new Estudante("12212", "Maria", new double[] {5, 7, 9}, "11/04/2019");
		estudante.imprime();
	}
}
