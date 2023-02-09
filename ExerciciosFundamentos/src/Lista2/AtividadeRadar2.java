package Lista2;

import java.util.Scanner;

public class AtividadeRadar2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int velocidade[], contAltaVelocidade = 0, contConsecultivas = 0, cont = 0, maiorVelocidade = 0;
		double multa = 0.00;
		velocidade = new int[10];
		for (int x = 0; x < velocidade.length; x++) {
			System.out.println(" Informe a velocidade do veiculo ao passar pelo  radar: ");
			velocidade[x] = ler.nextInt();// entre 40 a 150 km/h
			if (velocidade[x] <= (80 * 1.20) && velocidade[x] > 80) {
				contAltaVelocidade++;
				multa = multa + 100;
			}
			if (velocidade[x] > (80 * 1.20)) {
				multa = multa + 300;
			}
		}
		if (velocidade[0] == velocidade[1] || velocidade[1] == velocidade[2] || velocidade[2] == velocidade[3]) {
			contConsecultivas++;
		}
		if (velocidade[3] == velocidade[4] || velocidade[4] == velocidade[5] || velocidade[5] == velocidade[6]) {
			contConsecultivas++;
		}
		if (velocidade[6] == velocidade[7] || velocidade[7] == velocidade[8] || velocidade[8] == velocidade[9]) {
			contConsecultivas++;
		}
		for (int x = 0; x < velocidade.length; x++) {
			if (maiorVelocidade < velocidade[x]) {
				maiorVelocidade = velocidade[x];
				cont = x + 1;
			}
		}
		System.out.println(" A quantidade de vezes que o carro teve a mesma velocidade em radares consecutivos foi : "
				+ contConsecultivas + " vez(es)");
		System.out.println("O radar com a maior diferença positiva entre as velocidades foi o: " + cont);
		System.out.println("O número de vezes que a velocidade do carro excedeu até 20% da velocidade máxima: "
				+ contAltaVelocidade + " vez(es)");
		System.out.println(" Valor total das multas: " + multa + " reais");
	}
}