import java.util.*;

public class Exercicio2
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Informe quantos kilometros percorreu: ");
		double km=scan.nextDouble();
		System.out.println("Informe a quantidade do combutivel em litros: ");
		double l=scan.nextDouble();
		System.out.printf("Você fez %.02fkm/l", km/l);
	}
}
