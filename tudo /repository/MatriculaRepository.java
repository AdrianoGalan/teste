package br.com.adrianogalan.notasSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.Aluno;
import br.com.adrianogalan.notasSiga.model.entity.AlunoComFalta;
import br.com.adrianogalan.notasSiga.model.entity.AlunoComNota;
import br.com.adrianogalan.notasSiga.model.entity.Disciplina;
import br.com.adrianogalan.notasSiga.model.entity.Matricula;
import br.com.adrianogalan.notasSiga.model.id.MatriculaId;

public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaId> {
	
	List<Aluno> listAlunoByCodigoDisciplina(int codigoDisciplina);
	List<Disciplina> listDisciplinaByRaAluno(int raAlino);
	List<AlunoComNota> listAlunoComNota(int codigoDisciplina);
	List<AlunoComFalta> listAlunoComFalta(int codigoDisciplina, String data);
	
	
	

}
