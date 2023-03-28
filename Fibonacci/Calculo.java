package Fibonacci;

public class Calculo {
	
	public double Fibon(int N) {
		if (N < 2) {
			return 1;
		}
		
		return Fibon(N - 1) + Fibon(N - 2);
		
	}

}
