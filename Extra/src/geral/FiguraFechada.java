package geral;

import regras.Preenchivel;
import regras.Coordenada;

public abstract class FiguraFechada extends Geometria implements Preenchivel {
	private double area;
	private double perimetro;
	private Coordenada centroGeometrico;
	
	@Override
	public void preenche() {
		// TODO Auto-generated method stub
	}
	
	@Override
	void desenha(){
		
	}
	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Coordenada getCentroGeometrico() {
		return centroGeometrico;
	}

	public void setCentroGeometrico(Coordenada centroGeometrico) {
		this.centroGeometrico = centroGeometrico;
	}
	
	public Coordenada calculaCentroGeometrico(){
		Coordenada calculo=new Coordenada();
		return calculo;
	}
	
	public double calculaPerimetro(){
		double calculo=0;
		return calculo;
	}
	
	public double calculaArea(){
		double calculo=0;
		return calculo;
	}

}
