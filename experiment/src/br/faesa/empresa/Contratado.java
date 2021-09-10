package br.faesa.empresa;

public class Contratado extends Horista {
	private Double perfil;
	
	public Contratado() {
	}
	
	public Contratado(String nome, String cpf, Double fatura, Double perfil) {
		super(nome, cpf, fatura);
		this.perfil = perfil;
	}

	@Override
	public void admite(){

	}
	
	@Override
	public void demite(){
	
	}

	@Override
	public void calculaFatura() {
		System.out.println(getClass().getSimpleName()+".calculaFatura() => "+getFatura());
	}

	public Double getPerfil() {
		return perfil;
	}

	public void setPerfil(Double perfil) {
		this.perfil = perfil;
	}
	
	@Override
	public String toString() {
		return super.toString()+", "+perfil;
	}

}
