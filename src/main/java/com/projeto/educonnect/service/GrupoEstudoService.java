package com.projeto.educonnect.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.educonnect.dto.GrupoEstudoDTO;
import com.projeto.educonnect.entities.GrupoEstudo;
import com.projeto.educonnect.repository.GrupoEstudoRepository;


@Service
public class GrupoEstudoService {

	@Autowired
	private GrupoEstudoRepository grupoEstudoRepository;
	
	public List<GrupoEstudoDTO> listarTodos() {
		List<GrupoEstudo> gruposEstudo = grupoEstudoRepository.findAll();
		return gruposEstudo.stream().map(GrupoEstudoDTO::new).toList();
	}
	
	public void inserir(GrupoEstudoDTO grupoEstudo) {
		GrupoEstudo grupoEstudoEntity = new GrupoEstudo(grupoEstudo);
		grupoEstudoRepository.save(grupoEstudoEntity);
	}
	
	public GrupoEstudoDTO alterar(GrupoEstudoDTO grupoEstudo) {
		GrupoEstudo grupoEstudoAlterado = new GrupoEstudo(grupoEstudo);
		return new GrupoEstudoDTO(grupoEstudoRepository.save(grupoEstudoAlterado));
		
	}
	
	public void excluir(Long id) {
		GrupoEstudo grupoEstudo = grupoEstudoRepository.findById(id).get();
		grupoEstudoRepository.delete(grupoEstudo);
	}
	
	public GrupoEstudoDTO buscarPorID(Long id) {
		return new GrupoEstudoDTO(grupoEstudoRepository.findById(id).get());
	}
}

