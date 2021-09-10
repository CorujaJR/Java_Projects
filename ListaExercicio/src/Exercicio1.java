import java.util.*;

public class Exercicio1 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Informe a primeira nota: ");
		int n1=scan.nextInt();
		System.out.println("Informe a segunda nota: ");
		int n2=scan.nextInt();
		System.out.println("Informe a terceira nota: ");
		int n3=scan.nextInt();
		System.out.printf("A média total é %.02f", (double)(n1*2+n2*3+n3*5)/3);
	}
}
