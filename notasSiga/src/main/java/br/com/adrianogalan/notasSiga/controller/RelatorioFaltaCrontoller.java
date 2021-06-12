package br.com.adrianogalan.notasSiga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianogalan.notasSiga.model.entity.RelatorioFalta;
import br.com.adrianogalan.notasSiga.repository.RelatorioFaltaRepository;

@RestController
@RequestMapping("/")
public class RelatorioFaltaCrontoller {
	
	@Autowired
	private RelatorioFaltaRepository rRep;

	@CrossOrigin
	@GetMapping("/relatorio/falta/{codigo}")
	public List<RelatorioFalta> getRelatorioNotaCodigo(@PathVariable(value = "codigo") int codigo) {

		List<RelatorioFalta> relatorioFalta = rRep.listRelatorioFaltaCodigoDisciplina(codigo);
		return relatorioFalta;

	}

}
