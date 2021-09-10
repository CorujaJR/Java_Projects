package br.faesa.empresa.negocio;

public class Equipamento {
	private String descricaoEquipamento;
	private double custoLocacao;
	private double duracaoLocacao;
	public String getDescricaoEquipamento() {
		return descricaoEquipamento;
	}
	public void setDescricaoEquipamento(String descricaoEquipamento) {
		this.descricaoEquipamento = descricaoEquipamento;
	}
	public double getCustoLocacao() {
		return custoLocacao;
	}
	public void setCustoLocacao(double custoLocacao) {
		this.custoLocacao = custoLocacao;
	}
	public double getDuracaoLocacao() {
		return duracaoLocacao;
	}
	public void setDuracaoLocacao(double duracaoLocacao) {
		this.duracaoLocacao = duracaoLocacao;
	}
}
