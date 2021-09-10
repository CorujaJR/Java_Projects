import java.util.*;

public class Exercicio8 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		int num, a, b, c, d;
		System.out.println("Informe um número inteiro de 4 dígitos diferentes:");
		num=scan.nextInt();
		d=num/1000;
		a=(num/100)%10;
		b=(num%100)/10;
		c=(num%10)%10;
		System.out.println("Resultado:"+d+a+b+c);
	}
}
