package br.com.adrianogalan.notasSiga.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianogalan.notasSiga.model.entity.Nota;
import br.com.adrianogalan.notasSiga.model.id.NotaId;

public interface NotaRepository  extends JpaRepository<Nota, NotaId> {

}
