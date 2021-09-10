package br.faesa.empresa;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Horista extends RecursoHumano {
	private Double fatura;
	
	public Horista() {
	}

	public Horista(String nome, String cpf, Double fatura) {
		super(nome, cpf);
		this.fatura = fatura;
	}

	@Override
	public void admite() {

	}

	@Override
	public void demite() {

	}

	public abstract void calculaFatura();{
		System.out.println(getClass().getSimpleName()+".calculaFatura() => "+getFatura());
	}

	public Double getFatura() {
		return fatura;
	}

	public void setFatura(Double fatura) {
		this.fatura = fatura;
	}
	
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		return super.toString()+", "+nf.format(fatura);
	}
}
