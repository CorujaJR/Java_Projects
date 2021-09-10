import java.util.*;

public class Exercicio5
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Digite o valor em Celsius: ");
		double cel=scan.nextDouble();
		System.out.printf("O resultado em Fahrenheit e de %.02fF",((cel/5)*9)+32);	
	}
}
