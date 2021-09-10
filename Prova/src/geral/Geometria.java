package geral;

import regras.Coordenada;
import regras.Selecionavel;
import regras.Transformavel;

public abstract class Geometria implements Selecionavel, Transformavel {

	void desenha(){
		
	}
	
	@Override
	public void translada() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rotaciona() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deforma() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estaContido(Coordenada coord) {
		// TODO Auto-generated method stub
		return false;
	}

}
