package br.faesa.empresa;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private List<RecursoHumano> equipe;
	public Equipe() {
		equipe = new ArrayList<RecursoHumano>();
	}
	
	public Equipe(List<RecursoHumano> equipe) {
		this.equipe = equipe;
	}
	
	public List<RecursoHumano> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<RecursoHumano> equipe) {
		this.equipe = equipe;
	}
	
	public void exibeEquipe(){
		for (RecursoHumano rH : equipe) {
			System.out.println(rH);
		}
	}

	public void demiteGeral() {
		for(RecursoHumano rH : equipe){
			rH.demite();
		}
	}
	
	public void calculaFolha(){
		for(RecursoHumano rH : equipe){
			if(rH instanceof Funcionario){
				((Funcionario)rH).calculaSalario();
			}
			if(rH instanceof Horista){
				((Horista)rH).calculaFatura();
			}
		}
	}
	
}
