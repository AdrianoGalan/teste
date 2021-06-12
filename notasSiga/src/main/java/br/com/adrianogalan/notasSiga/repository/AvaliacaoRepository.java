package br.com.adrianogalan.notasSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.Avaliacao;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>  {

}
