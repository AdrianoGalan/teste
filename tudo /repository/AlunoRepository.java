package br.com.adrianogalan.notasSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.adrianogalan.notasSiga.model.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	
	Aluno alunoByRa(int ra);
	

}
