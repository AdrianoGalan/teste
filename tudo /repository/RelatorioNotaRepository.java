package br.com.adrianogalan.notasSiga.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.RelatorioNota;

public interface RelatorioNotaRepository extends JpaRepository<RelatorioNota, Integer> {
	
	List<RelatorioNota> listRelatorioNotaCodigoDisciplina(int codigo);

}
