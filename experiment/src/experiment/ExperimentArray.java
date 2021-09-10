package experiment;
import java.util.*;
public class ExperimentArray {
	static Scanner input=new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Informe um número inicial: ");
		int vInicial=input.nextInt();
		System.out.print("Informe um número final: ");
		int vFinal=input.nextInt();
		int Array[]= new int[10];
		for (int i = 0; i < Array.length; i++) {
			Array[i]=(int)((Math.random()*(vFinal-vInicial+1))+vInicial);
		}
		int min=Array[0];
		int max=Array[0];
		double media=0;
		for (int i = 0; i < Array.length; i++) {
			if (min>Array[i]){
				min=Array[i];
			}
			if(max<Array[i]){
				max=Array[i];
			}
			media=media+Array[i];
		}
		media=media/10;
		System.out.println("\n\nVetor:");
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i]+" ");	
		}
		System.out.println("\n\nValor máximo: "+max+"\nValor minimo: "+min+"\nMédia: "+media);
	}
}
