import java.util.Scanner;
public class Ex2 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Escreva o número de notas: ");
		int N=scan.nextInt();
		double notas[]=nota(N);
		double max=maximo(notas);
		double min=minimo(notas);
		double med=media(notas, N);
		System.out.println("\n\nMaior nota: "+max+"\nMenor nota: "+min+"\nMédia das notas: "+med);
	}
	static double[] nota(int n){
		double notas[]=new double[n];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota "+(i+1)+": ");
			notas[i]=scan.nextDouble();
		}
		return notas;
	}
	static double maximo(double[] notas){
		double max=notas[0];
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]>max){
				max=notas[i];
			}
		}
		return max;
	}
	static double minimo(double[] notas){
		double min=notas[0];
		for (int i = 0; i < notas.length; i++) {
			if(notas[i]<min){
				min=notas[i];
			}
		}
		return min;
	}
	static double media(double[] notas,int n){
		double med=0;
		for (int i = 0; i < notas.length; i++) {
			med=notas[i]+med;
		}
		return med/n;
	}
}
