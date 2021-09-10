package br.faesa.empresa;

public abstract class RecursoHumano {
	private String nome;
	private String cpf;
	
	public RecursoHumano(){
	}
	
	public RecursoHumano(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	public abstract void admite();
	public abstract void demite();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString(){
		return "["+nome+", "+cpf;
	}
}
