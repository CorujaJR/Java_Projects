package experiment;
import java.util.Random;

public class MoreTest {
	public static void main(String[] args) {
		//inst�ncia um objeto da classe Random usando o construtor b�sico
		Random gerador = new Random();
		//imprime sequ�ncia de 10 n�meros inteiros aleat�rios entre 0 e 19
		for (int i = 0; i < 10; i++) {
		System.out.println(gerador.nextInt(20));
		}
	} 
}
