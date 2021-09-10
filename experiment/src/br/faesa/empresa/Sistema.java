package br.faesa.empresa;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args){
		RecursoHumano g1 = new Gerente("Igor","032.345.256-02","100011",25000D,2000D);
		RecursoHumano g2 = new Gerente("Matheus","028.323.457-32","100012",25000D,3000D);
		RecursoHumano c1 = new Contratado("Alexander","048.048.048-36",21000D,5000D);
		RecursoHumano c2 = new Contratado("Marcos","036.036.036-36",22000D,4000D);
		RecursoHumano c4 = new Contratado("Carlos","048.068.048-36",24000D,4000D);
		RecursoHumano c5 = new Contratado("Vitor","028.048.048-36",25000D,5000D);
		RecursoHumano c6 = new Contratado("Sérgio","348.038.048-36",26000D,6000D);
		RecursoHumano c7 = new Contratado("Junior","048.043.048-36",27000D,7000D);
		RecursoHumano c8 = new Contratado("Leonardo","045.047.048-36",28000D,1000D);

		List<RecursoHumano>folhaPg = new ArrayList<RecursoHumano>();
		folhaPg.add(g1);
		folhaPg.add(g2);
		folhaPg.add(c1);
		folhaPg.add(c2);
		folhaPg.add(c4);
		folhaPg.add(c5);
		folhaPg.add(c6);
		folhaPg.add(c7);
		folhaPg.add(c8);

	}
}
