package com.projeto.educonnect.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projeto.educonnect.dto.UsuarioDTO;
import com.projeto.educonnect.entities.Usuario;
import com.projeto.educonnect.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioDTO> listarTodos() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios.stream().map(UsuarioDTO::new).toList();
	}
	
	public void inserir(UsuarioDTO usuario) {
		Usuario usuarioEntity = new Usuario(usuario);
		usuarioRepository.save(usuarioEntity);
	}
	
	public UsuarioDTO alterar(UsuarioDTO usuario) {
		Usuario usuarioAlterado = new Usuario(usuario);
		return new UsuarioDTO(usuarioRepository.save(usuarioAlterado));
	}
	
	public void excluir(Long id) {
		Usuario usuario = usuarioRepository.findById(id).get();
		usuarioRepository.delete(usuario);
	}
	
	public UsuarioDTO buscarPorID(Long id) {
		return new UsuarioDTO(usuarioRepository.findById(id).get());
	}
}
