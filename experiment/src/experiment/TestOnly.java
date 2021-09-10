package experiment;
import java.util.*;

public class TestOnly {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args){
		String word = "0";
		String dica="0";
		boolean sair=false;
		while(sair==false){
			System.out.println("Jogo da Forca\n\nSelecione as opções abaixo:\n1 - Inserir Nova Palavra\n2 - Jogar\n3 - Sair");
			int opc=scan.nextInt();
			switch(opc){
			case 1:
				word = palavra("Escreva uma palavra: ");
				dica = palavra("Escreva uma dica: ");
				break;
			case 2:
				if(word=="0"){
					System.out.println("Insira uma palavra antes de iniciar o jogo!\n");
				}
				else{
				jogo(dica, word);
				}
				break;
			case 3:
				sair=true;
				System.out.println("Saindo do jogo!");
				break;
		}
		}
	}
	public static String palavra(String Question){
		System.out.println(Question);
		String word=scan.nextLine();
		return word;
	}
	public static void jogo(String dica,String palavra){
		String map=palavra.toUpperCase();
		char Mystery[]=new char[palavra.length()];
		int u=0;
		for (u = 0; u < Mystery.length; u++) {
			if(palavra.charAt(u)!=' '){
				Mystery[u]='-';
			}
			else{
				Mystery[u]=palavra.charAt(u);
			}
		}
		boolean result=false;
		u=0;
		String Misterio=new String(Mystery);
		System.out.println(" ____\n |  |\n    |\n    |\n    |\n\n"+Misterio+"\n\n"+dica+"\n\nDigite uma letra:");
		boolean gameover=false;
		int tent=6;
		String invalid="";
		String compara="";
		while(tent!=0&&map.equals(compara)!=true){
			String letra=scan.next();
			String select=letra.toUpperCase();
				while(u<Misterio.length()){
					if(select.charAt(0)==map.charAt(u)){
						Mystery[u]=letra.charAt(0);
						Misterio=new String(Mystery);
						result=true;
					}
					u++;
				}
				if(result==false){
					char a=letra.charAt(0);
					invalid=new String(invalid+a+", ");
					tent--;
				}
				result=false;
				switch(tent){
				case 5:
					System.out.println(" ____\n |  |\n o  |\n    |\n    |\n");
					break;
				case 4:
					System.out.println(" ____\n |  |\n o  |\n |  |\n    |\n");
					break;
				case 3:
					System.out.println(" ____\n |  |\n o  |\n |\\ |\n    |\n");
					break;
				case 2:
					System.out.println(" ____\n |  |\n o  |\n/|\\ |\n    |\n");
					break;
				case 1:
					System.out.println(" ____\n |  |\n o  |\n/|\\ |\n  \\ |\n");
					break;
				case 0:
					System.out.println(" ____\n |  |\n o  |\n/|\\ |\n/ \\ |\n");
					break;
				default:
					System.out.println(" ____\n |  |\n    |\n    |\n    |\n");
				}
				if(tent==0)
				{
					gameover=true;
				}
				compara=Misterio.toUpperCase();
				if(gameover==false&&map.equals(compara)!=true){
					System.out.println(Misterio+"\n\n"+dica+"\n\nLetras invalidas:\n"+invalid+"\nDigite uma letra:");
				}
				u=0;
		}
		System.out.println(Misterio+"\n\nFim de Jogo!");
		if(gameover==true){
			System.out.println("Você foi enforcado!\nA palavra é: "+palavra+"\n\n\n");
		}
		else{
			System.out.println("Você ganhou!\n\n\n");
		}
	}
}