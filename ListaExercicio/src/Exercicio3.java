import java.util.*;

public class Exercicio3 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Informe o nome: ");
		String nome=scan.nextLine();
		System.out.println("Informe quantos kilometros percorreu: ");
		double km=scan.nextDouble();
		System.out.println("Informe a quantidade de tempo percorrido (em horas): ");
		int h=scan.nextInt();
		double vm=km/(double)h;
		System.out.printf("A velocidade m�dia de %s foi %.02f km/h, onde %s � o nome do piloto, e %.02f � a velocidade m�dia.", nome, vm, nome, vm);
	}
}
