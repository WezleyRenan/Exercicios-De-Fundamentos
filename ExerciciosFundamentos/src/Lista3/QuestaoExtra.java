package Lista3;

import java.text.DecimalFormat;
import java.util.Random;

public class QuestaoExtra {
	public static int trimestre(int x) {       //metodo de trimestre
		if (x<=3) {
			x=1;
		}
		if (x>3&&x<=6) {
			x=2;
		}
		if (x>6&&x<=9) {
			x=3;
		}
		if (x>9&&x<=12) {
			x=4;
		}
		return x;
	}
	public static int semestre(int x) {        //metodo de semestre
		if (x<=6) {
			x=1;
		}
		if(x<=12&&x>6) {
			x=2;
		}
		return x;
	}
	public static void main(String[] args) {
		int mes,tri,sem;double seg[]=new double[10];
		Random rand=new Random();
		DecimalFormat decimal=new DecimalFormat("#0.00");
		for (int i=0;i<10;i++) {
			mes=rand.nextInt(12);
			while (mes==0) {
				mes=rand.nextInt(12);
			}
			tri=trimestre(mes);
			sem=semestre(mes);
			System.out.println("mes: "+mes+" -->"+" "+tri+"T"+" "+sem+"S");
		}
		System.out.println("vetor de tempo dos 100 m rasos");
		for (int i=0;i<seg.length;i++) {
			seg[i]=rand.nextDouble(110);
			while (seg[i]<95) {
				seg[i]=rand.nextDouble(110);
			}
			seg[i]=seg[i]/10;
			System.out.print(decimal.format(seg[i])+" ");
		}
	}
}