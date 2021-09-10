package br.faesa.empresa;

import java.text.NumberFormat;
import java.util.Locale;

public class Gerente extends Funcionario {
	private Double gratificacao;
	
	public Gerente() {
	}

	public Gerente(String nome, String cpf, String matricula, Double salario, Double gratificacao) {
		super(nome, cpf, matricula, salario);
		this.gratificacao = gratificacao;
	}

	@Override
	public void admite(){
		super.admite();
		//...
	}
	
	@Override
	public void demite() {
		super.demite();
		//...
	}
	
	@Override
	public void calculaSalario() {
		System.out.println(getClass().getSimpleName()+".calculaSalario() => "+getSalario());
	}

	public Double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(Double gratificacao) {
		this.gratificacao = gratificacao;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		return super.toString()+", "+nf.format(gratificacao);
	}

}
