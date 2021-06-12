package br.com.adrianogalan.notasSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.adrianogalan.notasSiga.model.entity.Aula;

public interface AulaRepository extends JpaRepository<Aula, Integer> {

	List<Aula> aulasDataByCodigoDisciplina(int codigoDisciplina);

}
