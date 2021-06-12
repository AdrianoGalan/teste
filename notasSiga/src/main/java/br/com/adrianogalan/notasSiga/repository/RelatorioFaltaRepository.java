package br.com.adrianogalan.notasSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.RelatorioFalta;

public interface RelatorioFaltaRepository extends JpaRepository<RelatorioFalta, Integer> {
	
	List<RelatorioFalta> listRelatorioFaltaCodigoDisciplina(int codigo);



}
