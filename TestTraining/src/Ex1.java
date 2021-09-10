import java.util.Scanner;
public class Ex1 {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		double a=scanner("a.");
		double b=scanner("b.");
		double c=scanner("c.");
		double x[]=new double[2];
		if(a>0){
			double dlt=delta(a, b, c);
			if(dlt>=0){
				x=result(b, a, dlt);
			}
			else
			{
				System.out.println("Não existe resultado pra raiz de "+dlt+".");
			}
		}
		else{
			System.out.println("A equação não é de segundo grau!\nx = "+(-c/b));
		}
		System.out.println("\nResultados:\nx' = "+x[0]+" x\" = "+x[1]+"");
	}
	static double scanner(String text){
		System.out.println("Digite o valor de "+text);
		double val=scan.nextDouble();
		return val;
	}
	static double delta(double a,double b,double c){
		double dlt=Math.pow(b, 2)-4*a*c;
		return dlt;
	}
	static double[] result(double b, double a, double dlt){
		double[] x=new double[2];
		x[0]=(-b+Math.sqrt(dlt))/2*a;
		x[1]=(-b-Math.sqrt(dlt))/2*a;
		return x;
	}
}
