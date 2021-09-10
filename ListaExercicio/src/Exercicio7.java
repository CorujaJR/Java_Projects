import java.util.*;

public class Exercicio7
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Descreva a latitude do ponto 1");
		double x1=scan.nextDouble();
		System.out.println("Descreva a longitude do ponto 1");
		double y1=scan.nextDouble();
		System.out.println("Descreva a latitude do ponto 2");
		double x2=scan.nextDouble();
		System.out.println("Descreva a longitude do ponto 2");
		double y2=scan.nextDouble();
		double dtcia=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.print("A distânicia entre os dois pontos é de "+dtcia);
	}
}
