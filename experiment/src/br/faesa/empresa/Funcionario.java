package br.faesa.empresa;

import java.text.NumberFormat;
import java.util.Locale;

public abstract class Funcionario extends RecursoHumano {
	private String matricula;
	private Double salario;
	
	public Funcionario() {	
	}
	
	public Funcionario(String nome, String cpf, String matricula, Double salario) {
		super(nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
	}
	@Override
	public void admite() {
		
	}
	@Override
	public void demite() {
		System.out.println();
	}
	
	public abstract void calculaSalario();{
		System.out.println(getClass().getSimpleName()+".calculaSalario() => "+getSalario());
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		return super.toString()+", "+matricula+", "+nf.format(salario);
	}
}
