package experiment;
import java.util.*;

public class Forca {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Escreva UMA palavra: ");
		String palavra=scan.nextLine();
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
		System.out.println(" ____\n |  |\n    |\n    |\n    |\n\n"+Misterio+"\n\nDica fica aqui"+"\n\nDigite uma letra:");
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
					System.out.println(Misterio+"\n\nDica fica aqui"+"\n\nLetras invalidas:\n"+invalid+"\nDigite uma letra:");
				}
				u=0;
		}
		System.out.println(Misterio+"\n\nFim de Jogo!");
		if(gameover==true){
			System.out.println("Você foi enforcado!\nA palavra é: "+palavra);
		}
		else{
			System.out.println("Você ganhou!");
		}
	}
}