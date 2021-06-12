package br.com.adrianogalan.notasSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer > {
	
	Disciplina disciplinaByCodigo(int codigo);

}
