import java.util.Scanner;
public class Ex3 {	
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		double a=scanner("a.");
		double b=scanner("b.");
		double c=scanner("c.");
		boolean trgl=triangulo(a, b, c);
		if(trgl){
			double A=area(a, b, c);
			System.out.println("\nArea do triangulo = "+A);
		}
		else{
			System.out.println("\nNão forma triangulo.");
		}
	}
	static double scanner(String text){
		System.out.println("Digite o valor de "+text);
		double val=scan.nextDouble();
		return val;
	}
	static boolean triangulo(double a,double b,double c){
		boolean confirm=false;
		if(a+b > c && b+c>a && a+b>c){
			confirm=true;
		}
		return confirm;
	}
	static double area(double a,double b,double c){
		double s=(a+b+c)/2;
		double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return A;
	}
}
