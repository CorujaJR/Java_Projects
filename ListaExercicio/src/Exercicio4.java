import java.util.*;

public class Exercicio4
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Informe a quantidade de pessoas:");
		int pessoas=scan.nextInt();
		System.out.println("Informe quantas tulipas de chope foram consumidas: ");
		int chope=scan.nextInt();
		System.out.println("Informe quantas coberturas foram colocadas na pizza: ");
		int cP=scan.nextInt();
		double conta=chope*1.8+25+cP*3.5;
		double garçom=conta*10/100;
		System.out.printf("São R$%.02f pelos pedidos e mais R$%.02f pro garçom, sendo o total R$%.02f e cada um deve pagar R$%.02f.",conta,garçom,conta+garçom,(conta+garçom)/pessoas);
	}
}
