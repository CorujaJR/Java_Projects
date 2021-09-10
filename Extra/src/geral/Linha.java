package geral;

import regras.Coordenada;

public class Linha extends Geometria {
	private Coordenada p0;
	private Coordenada p1;
	
	public Coordenada getP0() {
		return p0;
	}
	public void setP0(Coordenada p0) {
		this.p0 = p0;
	}
	public Coordenada getP1() {
		return p1;
	}
	public void setP1(Coordenada p1) {
		this.p1 = p1;
	}
	
	@Override
	void desenha(){
		
	}
	
	@Override
	public String toString() {
		return "p0("+p0.getX()+", "+p0.getY()+")\np1("+p1.getX()+", "+p1.getY()+")";
	}
}
