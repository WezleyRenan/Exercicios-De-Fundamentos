package Lista3;

import java.util.Scanner;

public class Questao02 {
	public static int credito() {
		int x;
		Scanner input=new Scanner(System.in);
		System.out.println("digite o valor a ser acrescentado no credito");
		x=input.nextInt();
		return x;
	}
	public static int debito() {
		int x;
		Scanner input=new Scanner(System.in);
		System.out.println("digite o valor a ser no debito");
		x=input.nextInt();
		x=x-x-x;
		return x;
	}
	public static void main(String[] args) {
		int v[]=new int[5];char type;int total=500;
		Scanner input=new Scanner(System.in);
		for (int i=0;i<v.length;i++) {
			System.out.println("escolha as seguintes operaçoes:");
			System.out.println("D=debito           C=credito");
			type=input.next().charAt(0);
			if (type=='D'||type=='d') {
				v[i]=debito();
			}
			if (type=='c'||type=='c') {
				v[i]=credito();
			}
			total=v[i]+total;
		}
		System.out.println("o valor total é "+total);
	}
}