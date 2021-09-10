import java.util.Comparator;


public class AlunoComparator implements Comparator<Aluno> {

	@Override
	public int compare(Aluno a0, Aluno a1) {
		int coeficientComp = (int) (1000*(a0.getCoeficiente() - a1.getCoeficiente()));
		if(coeficientComp != 0){
			return coeficientComp;
		}
		
		int a0Finalista = a0.isFinalista()?1:0;
		int a1Finalista = a1.isFinalista()?1:0;
		int finalistaComp = a0Finalista-a1Finalista;
		
		if (finalistaComp != 0){
			return finalistaComp;
		}
		
		int matriculaComp = a0.getMatricula().compareTo(a1.getMatricula());
		if (matriculaComp != 0){
			return matriculaComp;
		}
		
		
		return 0;
	}

}
