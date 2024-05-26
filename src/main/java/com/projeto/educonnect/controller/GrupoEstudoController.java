package com.projeto.educonnect.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projeto.educonnect.dto.GrupoEstudoDTO;
import com.projeto.educonnect.service.GrupoEstudoService;

@RestController
@RequestMapping(value ="/gruposEstudo")
public class GrupoEstudoController {
	
	@Autowired
    private GrupoEstudoService grupoEstudoService;
	
	@GetMapping
	public List<GrupoEstudoDTO> listarTodos() {
		return grupoEstudoService.listarTodos();
	}
	
	@PostMapping
	public void inserir(@RequestBody GrupoEstudoDTO grupoEstudo) {
		grupoEstudoService.inserir(grupoEstudo);
	}
	
	@PutMapping
	public GrupoEstudoDTO alterar(@RequestBody GrupoEstudoDTO grupoEstudo) {
		return grupoEstudoService.alterar(grupoEstudo);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
		grupoEstudoService.excluir(id);
		return ResponseEntity.ok().build();
	}
}

