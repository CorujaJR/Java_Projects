import java.util.*;

public class Exercicio6 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Digite um número: ");
		int num=scan.nextInt();
		System.out.printf("Triplo de %d: %d\nMetade de %d: %.01f\nRaiz cubica de %d: %f\nElevação à potência fracionária 2/3 de %d: %f",num,num*3,num,(double)num/2,num,Math.cbrt((double)num),num,Math.pow(num,(double)2/3));
	}
}