package br.com.adrianogalan.notasSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.Falta;
import br.com.adrianogalan.notasSiga.model.id.FaltaId;

public interface FaltaRepository extends JpaRepository<Falta, FaltaId>{

}
