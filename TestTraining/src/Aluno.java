
public class Aluno {
	private String matricula;
	private Double coeficiente;
	private String nome;
	private boolean finalista;
	
	public Aluno(){
		
	}
	
	public Aluno(String matricula, Double coeficiente, String nome,
			boolean finalista) {
		super();
		this.matricula = matricula;
		this.coeficiente = coeficiente;
		this.nome = nome;
		this.finalista = finalista;
	}



	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getCoeficiente() {
		return coeficiente;
	}
	public void setCoeficiente(Double coeficiente) {
		this.coeficiente = coeficiente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isFinalista() {
		return finalista;
	}
	public void setFinalista(boolean finalista) {
		this.finalista = finalista;
	}

	@Override
	public String toString() {
		return "\nAluno [matricula = " + matricula + ", coeficiente = " + coeficiente
				+ ", nome = " + nome + ", finalista = " + finalista + "]";
	}
	
	
}
