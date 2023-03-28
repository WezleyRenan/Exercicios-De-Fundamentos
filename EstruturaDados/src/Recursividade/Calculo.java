package Recursividade;

public class Calculo {
	private double N;

	public int fatorial(int N) {
		int resultado = N;
		if (N > 1) {
			return resultado * fatorial(N - 1);
		} else {
			return resultado = 1;
		}
	}
}
