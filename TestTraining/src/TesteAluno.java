import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TesteAluno {

	public static void main(String[] args) {
		List<Aluno>alunos = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("00120", 9.57, "Alexandre", true );
		Aluno a2 = new Aluno("00121", 9.75, "Matheus"  , false);
		Aluno a3 = new Aluno("00123", 8.75, "Geraldo"  , false);
		Aluno a4 = new Aluno("00124", 7.75, "Carlos"   , true );
		Aluno a5 = new Aluno("00125", 8.45, "Marcio"   , false);
		Aluno a6 = new Aluno("00126", 7.65, "Arno"     , true );
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);
		//Exibe lista...
		System.out.println(alunos);
		System.out.println("==================================");
		//Orderna lista...
		Collections.sort(alunos, new AlunoComparator());
		//Exibe lista...
		System.out.println(alunos);
	}

}
