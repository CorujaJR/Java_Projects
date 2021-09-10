package experiment;
import java.util.Random;

public class MoreTest {
	public static void main(String[] args) {
		//instância um objeto da classe Random usando o construtor básico
		Random gerador = new Random();
		//imprime sequência de 10 números inteiros aleatórios entre 0 e 19
		for (int i = 0; i < 10; i++) {
		System.out.println(gerador.nextInt(20));
		}
	} 
}
